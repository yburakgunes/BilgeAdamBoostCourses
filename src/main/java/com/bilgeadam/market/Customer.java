package com.bilgeadam.market;

public class Customer extends Person {
	
	private double debit;
	
	public Customer(String firstName, String lastName, long personalID) {
		super(firstName, lastName, personalID);
		this.debit = 0.0d;
	}
	
	public void finishShopping(double totalAmount) {
		this.debit += totalAmount;
		
	}
	
	public void payOffDebt(double amount) {
		this.debit += amount;
	}
	
	@Override
	public double getCurrentAccount() {
		return debit;
	}
	
}
