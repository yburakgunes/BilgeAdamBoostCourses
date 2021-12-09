package com.bilgeadam.boost.javacourse01.lesson27;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = -887663160955483270L;
	private String street;
	private String city;
	private String country;
	private int number;
	
	public Address(String street, String city, String county, int number) {
		super();
		this.street = street;
		this.city = city;
		this.country = county;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", county=" + country + ", number=" + number + "]";
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getCounty() {
		return country;
	}
	
	public int getNumber() {
		return number;
	}
	
}
