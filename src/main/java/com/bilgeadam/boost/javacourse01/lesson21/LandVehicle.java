package com.bilgeadam.boost.javacourse01.lesson21;

public class LandVehicle extends Vehicle {
	protected int numOfTires;
	
	public LandVehicle(String name, String brand) {
		super(name, brand);
		this.name = "Kara Aracı";
		this.numOfTires = 0;
		
	}
	
}
