package com.bilgeadam.retirementhomework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Person {
	
	private static int count;
	private long id;
	private String name;
	private String surname;
	protected Date birthday;
	
	private static List<Person> listPerson;
	
	public Person() {
		this.id = count++;
		this.name = "Ad girilmedi";
		this.surname = "Soyad girilmedi";
		
	}
	
	public Person(String name, String surname, String birthday) {
		this.id = count++;
		this.name = name;
		this.surname = surname;
		this.birthday = stringToDate(birthday);
	}
	
	// kullanıcıdan girilen String tarih verisini date formatına dönüştürme
	private Date stringToDate(String strDate) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = format.parse(strDate);
		} catch (ParseException e) {
			throw new IllegalArgumentException("Tarihi hatalı girdiniz.");
		}
		
		return date;
		
	}
	
	public static void addListPerson(Person person) {
		if (listPerson == null) {
			listPerson = new ArrayList<Person>();
		}
		listPerson.add(person);
	}
	
	public static List<Person> getListPerson() {
		return listPerson;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", birtday=" + birthday + "]";
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Date getBirtday() {
		return birthday;
	}
	
	public void setBirtday(String birthday) { // dışardan string gircez date'e çevircek
		this.birthday = stringToDate(birthday);
	}
	
}