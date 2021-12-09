package com.bilgeadam.boost.javacourse01.lesson22;

public class PersonName {
	private String firstName;
	private String middleName;
	private String lastName;
	
	public PersonName(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = "";
	}
	
	public PersonName(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFullName() {
		String emptySpace = this.middleName.equals("") ? "" : " ";
		return this.firstName + " " + middleName + emptySpace + " " + this.lastName;
	}
	
	@Override
	public String toString() {
		return "[firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
	
}
