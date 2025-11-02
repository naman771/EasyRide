package com.comrade.EasyRide.entities;


import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;

@Entity
@Scope("prototype")
public class CabDriver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 50)
	private String name;
	private char gender;
	private int age;
	private String carName;
	private String carNumber;
	@Embedded
	private Coordinate location;
	private boolean status;
	private int earnings;

	public CabDriver() {}
	
	public CabDriver(String name, char gender, int age, String carName, String carNumber, Coordinate location, boolean status, int earnings) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.carName = carName;
		this.carNumber = carNumber;
		this.location = location;
		this.status = status;
		this.earnings = earnings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public Coordinate getLocation() {
		return location;
	}

	public void setLocation(Coordinate location) {
		this.location = location;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}
}
