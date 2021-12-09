package com.bilgeadam.boost.javacourse01.lesson22;

public class Employee extends Person{
	protected double salary;
	protected boolean fullTime;
	

	public Employee(long identityNumber, Gender gender, String firstName, String lastName, double salary, boolean fullTime) {
		super(identityNumber, gender, firstName, lastName);
		this.salary = salary;
		this.fullTime = fullTime;
		
		
	}
	
}
