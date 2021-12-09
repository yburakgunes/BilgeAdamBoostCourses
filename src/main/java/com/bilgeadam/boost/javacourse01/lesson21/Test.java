package com.bilgeadam.boost.javacourse01.lesson21;

public class Test {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Araba", "Volkswagen", 220.5);
		System.out.println(vehicle);
		vehicle.setColor(Color.BLUE);
		System.out.println(vehicle);
		
		System.out.println();
		
		Vehicle vehicle1 = new Vehicle("Uçak", "Airbus", 1000, 12200.75, Color.GREY);
		System.out.println(vehicle1);
		
		
		AirVehicle air = new AirVehicle("Helikopter", "Atak", 400.0, 5000.0, Color.BLACK);
		System.out.println(air);
		
		AirVehicle air1 = new AirVehicle("Helikopter", "Atak", 400.0, 5000.0, Color.BLACK, 0);
		System.out.println(air1);
	}
	
}
