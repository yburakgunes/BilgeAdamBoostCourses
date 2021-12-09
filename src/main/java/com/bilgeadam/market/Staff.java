package com.bilgeadam.market;

public class Staff extends Person {
	
	private double salary;
	private String title;
	
	public Staff(String firstName, String lastName, long personalID, double salary) {
		super(firstName, lastName, personalID);
		this.salary = salary;
		this.title = "";
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public double getCurrentAccount() {
		
		return this.salary;
	}
	
}
