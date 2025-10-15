package com.comrade.EasyRide.ride.Validator;

import com.comrade.EasyRide.bill.BillCalculator;
import com.comrade.EasyRide.distance.Distance;
import com.comrade.EasyRide.entities.CabDriver;
import com.comrade.EasyRide.entities.User;
import com.comrade.EasyRide.services.DriverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;




/*This Class check whether or not a ride is possible for the user 
and if possible, then it calculates the price and further proceedings.*/

@Component
public class RideValidator {

	@Autowired
	DriverServiceImpl driverService;
	public void rideValidation(List<User> UserList, List<CabDriver> DriverList ) {
		for (User user : UserList) {
			boolean flag = false;
			for (CabDriver driver : DriverList) {
				int price = 0;
				if (driver.isStatus()) {
					if (Distance.distanceCalculator(user.getLocation(), driver.getLocation()) <= 5) {
						driver.setStatus(false);
						flag = true;
						price = BillCalculator.calculateBill(user.getLocation(),user.getDestination());
						System.out.println("Ride started for "+user.getName());
						System.out.println("Price to be paid by "+ user.getName()+ " $"+(int)price);
						user.setLocation(user.getDestination());
						int earning=driver.getEarnings();
						driver.setEarnings(earning+price);
						driver.setStatus(true);
						driverService.addDriver(driver);

						break;
					}
				}
			}
			if (!flag) {
				System.out.println("No cab found for "+ user.getName());
			}
		}
	}
}
