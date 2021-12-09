package com.bilgeadam.boost.javacourse01.lesson21;

public class AirVehicle extends Vehicle {
	private String name;
	private int numOfWings;
	private double wingLength;
	private double maxAltitude;
	private double currAltitude;
	
	public AirVehicle(String name, String brand, double maxSpeed) {
		super(name, brand, maxSpeed);
		this.numOfWings = 0;
		this.wingLength = 0.0;
		this.maxAltitude = 0.0;
		this.currAltitude = 0.0;
	}
	
	public AirVehicle(String name, String brand, double maxSpeed, double mass, Color color) {
		super(name, brand, maxSpeed, mass, color);
		super.name = "Ana Araç"; // Vehicle's name
		this.name = name; // AirVehicle's name
		this.numOfWings = 0;
		this.wingLength = 0.0;
	}
	
	public AirVehicle(String name, String brand, double maxSpeed, double mass, Color color, int numOfWings) {
		this(name, brand, maxSpeed, mass, color);
		this.numOfWings = numOfWings;
	}
	
	@Override
	public String toString() {
		return "AirVehicle [name=" + name + ", Üstisim=" + super.name + ", brand=" + brand + ", color=" + color
				+ ", mass=" + mass + ", maxSpeed=" + maxSpeed + ", currSpeed=" + currSpeed + ", numOfWings="
				+ numOfWings + "]";
	}
	
}