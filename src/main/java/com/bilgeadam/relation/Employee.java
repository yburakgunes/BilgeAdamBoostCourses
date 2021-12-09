package com.bilgeadam.relation;

public class Employee {
	private String emplyeeName;
	private String employeeSurname;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String emplyeeName, String employeeSurname) {
		super();
		this.emplyeeName = emplyeeName;
		this.employeeSurname = employeeSurname;
	}
	
	@Override
	public String toString() {
		return "Employee [emplyeeName=" + emplyeeName + ", employeeSurname=" + employeeSurname + "]";
	}
	
	public String getEmplyeeName() {
		return emplyeeName;
	}
	
	public void setEmplyeeName(String emplyeeName) {
		this.emplyeeName = emplyeeName;
	}
	
	public String getEmployeeSurname() {
		return employeeSurname;
	}
	
	public void setEmployeeSurname(String employeeSurname) {
		this.employeeSurname = employeeSurname;
	}
	
}
