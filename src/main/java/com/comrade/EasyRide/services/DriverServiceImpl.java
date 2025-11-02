<<<<<<< HEAD
package com.comrade.EasyRide.services;

import java.util.ArrayList;
import java.util.List;

import com.comrade.EasyRide.dao.DriverDao;
import com.comrade.EasyRide.entities.Coordinate;
import com.comrade.EasyRide.entities.CabDriver;
import com.comrade.EasyRide.entities.NullCabDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverDao driverDao;

	List<CabDriver> driverList = new ArrayList<>();
	public void loadDrivers(){
		driverList.add(new CabDriver("Driver1", 'M', 22, "Swift", "KA-01-2145", new Coordinate(10, 1), true,0));
		driverList.add(new CabDriver("Driver2", 'M', 29, "Swift", "KA-01-5654", new Coordinate(11, 10), true,0));
		driverList.add(new CabDriver("Driver3", 'M', 24, "Swift", "KA-01-1258", new Coordinate(5, 3), true,0));
		driverDao.saveAll(driverList);
	}

	public List<CabDriver> getList() {
		return driverDao.findAll();
	}
	public void addDriver(CabDriver driver) {
		driverDao.save(driver);
	}

	public void removeDriver(CabDriver driver) {
		driverDao.delete(driver);
	}

	public CabDriver getDriverById(int driverId) {
		CabDriver driver = driverDao.findById(driverId).orElse(null);
		if(driver == null){
			return new NullCabDriver();
		}
		return driver;
	}
}
=======
package com.comrade.EasyRide.services;

import java.util.ArrayList;
import java.util.List;

import com.comrade.EasyRide.dao.DriverDao;
import com.comrade.EasyRide.entities.Coordinate;
import com.comrade.EasyRide.entities.CabDriver;
import com.comrade.EasyRide.entities.NullCabDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverDao driverDao;

	List<CabDriver> driverList = new ArrayList<>();
	public void loadDrivers(){
		driverList.add(new CabDriver("Driver1", 'M', 22, "Swift", "KA-01-2145", new Coordinate(10, 1), true,0));
		driverList.add(new CabDriver("Driver2", 'M', 29, "Swift", "KA-01-5654", new Coordinate(11, 10), true,0));
		driverList.add(new CabDriver("Driver3", 'M', 24, "Swift", "KA-01-1258", new Coordinate(5, 3), true,0));
		driverDao.saveAll(driverList);
	}

	public List<CabDriver> getList() {
		return driverDao.findAll();
	}
	public void addDriver(CabDriver driver) {
		driverDao.save(driver);
	}

	public void removeDriver(CabDriver driver) {
		driverDao.delete(driver);
	}

	public CabDriver getDriverById(int driverId) {
		CabDriver driver = driverDao.findById(driverId).orElse(null);
		if(driver == null){
			return new NullCabDriver();
		}
		return driver;
	}
}
>>>>>>> 6f19ae1a65bb04279018f5696ea45a9f9cebc278
