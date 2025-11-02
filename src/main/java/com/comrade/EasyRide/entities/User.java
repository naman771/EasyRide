package com.comrade.EasyRide.entities;


import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;

@Entity
@Scope("prototype")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 50)
	private String name;
	private char gender;
	private int age;
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "x", column = @Column(name = "location_x")),
			@AttributeOverride(name = "y", column = @Column(name = "location_y"))
	})
	private Coordinate location;
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "x", column = @Column(name = "destination_x")),
			@AttributeOverride(name = "y", column = @Column(name = "destination_y"))
	})
	private Coordinate destination;

	public User() {}
	
	public User(String name, char gender, int age, Coordinate location, Coordinate destination) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.location = location;
		this.destination = destination;
	}
	
	public User(int id, String name, char gender, int age, Coordinate location, Coordinate destination) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.location = location;
		this.destination = destination;
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

	public Coordinate getLocation() {
		return location;
	}

	public void setLocation(Coordinate location) {
		this.location = location;
	}

	public Coordinate getDestination() {
		return destination;
	}

	public void setDestination(Coordinate destination) {
		this.destination = destination;
	}
}
