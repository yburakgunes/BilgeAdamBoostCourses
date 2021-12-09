package com.bilgeadam.relation;

public class AssociationTutorial {
	public static void main(String[] args) {
		Bank bank = new Bank("xyz bank", "Ankara");
		Employee employee = new Employee("Adım", "Soyadım");
		
		System.out.println(bank.getBankName() + " adlı bankanın " + employee.getEmployeeSurname());
	}
}
