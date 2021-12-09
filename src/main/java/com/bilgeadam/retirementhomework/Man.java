package com.bilgeadam.retirementhomework;

import java.util.Date;

public class Man extends Person implements IProcessPerson {
	
	private int retirementAge = 65;
	private static final EGender gender = EGender.MAN;
	
	public Man() {
		super();
		
	}
	
	public Man(String name, String surname, String birtday) {
		super(name, surname, birtday);
		
	}
	
	@Override
	public String toString() {
		return "Man [retirementAge=" + retirementAge + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getSurname()=" + getSurname() + ", getBirtday()=" + getBirtday() + "]";
	}
	
	public int getRetirementAge() {
		return retirementAge;
	}
	
	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}
	
	public static EGender getGender() {
		return gender;
	}
	
	@Override
	public int calculateAge() {
		Date now = new Date();
		int age = now.getYear() - birthday.getYear();
		if (age < 0) {
			throw new IllegalArgumentException("Daha doğmadınız.");
		}
		return age; // 2021-1996 = gibi yaptık
	}
	
	@Override
	public int retirementAge() {
		
		return this.retirementAge;
	}
	
	@Override
	public int yearsToRetirement() {
		
		return this.retirementAge - calculateAge();
		// emeklilik yaşı: 65
		// 65 - benim yaşım yani this.retirementAge - calculateAge()
		// bu bana emekliliğime kalan yılı gösterdi
	}
}
