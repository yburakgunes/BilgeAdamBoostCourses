package com.bilgeadam.market;

import java.util.Date;

// isim soyisim doğum tarihi kimlik no adres cinsiyet tel no
public abstract class Person {
	protected String firstName;
	private String lastName;
	private Date birthDate;
	protected long personalID;
	private String adress;
	private long[] telephone;
	private int telIndex;
	
	public Person(String firstName, String lastName, long personalID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.personalID = personalID;
		this.telephone = new long[3];
		this.birthDate = null;
		this.adress = "";
		this.telIndex = 0;
	}
	
	public abstract double getCurrentAccount();
	
	public boolean addTelephoneNumber(long number) {
		if (telIndex < 3) {
			this.telephone[telIndex] = number;
			telIndex++;
			return true;
			
		} else {
			return false;
		}
	}
	
}
