package com.bilgeadam.boost.javacourse01.lesson21;

public class Vehicle {
	protected String name;
	protected String brand;
	protected Color color;
	protected double mass;
	protected double maxSpeed;
	protected double currSpeed;
	
	public Vehicle(String name, String brand) {
		this.name = name;
		this.brand = brand;
//		this.maxSpeed = maxSpeed;
		this.mass = 0.0d;
		this.color = Color.NO_COLOR;
		this.currSpeed = 0.0d;
	}
	
	public Vehicle(String name, String brand, double maxSpeed, double mass, Color color) {
		this.name = name;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.mass = mass;
		this.color = color;
		this.currSpeed = 0.0;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public Color getColor() {
		return color;
	}
	
	public double getMass() {
		return mass;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public double getCurrSpeed() {
		return currSpeed;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	public void setCurrSpeed(double currSpeed) {
		this.currSpeed = currSpeed;
	}
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", brand=" + brand + ", color=" + color + ", mass=" + mass + ", maxSpeed="
				+ maxSpeed + ", currSpeed=" + currSpeed + "]";
	}
	
}
