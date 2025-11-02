<<<<<<< HEAD
package com.comrade.EasyRide.bill;


import com.comrade.EasyRide.entities.Coordinate;

public class BillCalculator {
	public static int calculateBill(Coordinate location, Coordinate destination) {
		int x1 = location.getX();
		int x2 = destination.getX();
		int y1 = location.getY();
		int y2 = destination.getY();
		return (int)Math.ceil(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
	}
}
=======
package com.comrade.EasyRide.bill;


import com.comrade.EasyRide.entities.Coordinate;

public class BillCalculator {
	public static int calculateBill(Coordinate location, Coordinate destination) {
		int x1 = location.getX();
		int x2 = destination.getX();
		int y1 = location.getY();
		int y2 = destination.getY();
		return (int)Math.ceil(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
	}
}
>>>>>>> 6f19ae1a65bb04279018f5696ea45a9f9cebc278
