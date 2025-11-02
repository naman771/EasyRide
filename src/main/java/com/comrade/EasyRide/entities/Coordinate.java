<<<<<<< HEAD
package com.comrade.EasyRide.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Coordinate {
    private int x;
	private int y;
	
	public Coordinate() {}
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
=======
package com.comrade.EasyRide.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Coordinate {
    private int x;
	private int y;
}
>>>>>>> 6f19ae1a65bb04279018f5696ea45a9f9cebc278
