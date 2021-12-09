package com.bilgeadam.retirementhomework;

import java.util.Date;

public class Woman extends Person implements IProcessPerson {
	
	private int retirementAge = 60;
	private static final EGender gender = EGender.WOMAN;
	
	public Woman() {
		super();
		
	}
	
	public Woman(String name, String surname, String birtday) {
		super(name, surname, birtday);
		
	}
	
	@Override
	public String toString() {
		return "Woman [retirementAge=" + retirementAge + ", getId()=" + getId() + ", getName()=" + getName()
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
		return now.getYear() - birthday.getYear(); // 2021-1996 = gibi yaptık
	}
	
	@Override
	public int retirementAge() {
		
		return this.retirementAge;
	}
	
	@Override
	public int yearsToRetirement() {
		
		return this.retirementAge - calculateAge();
		// emeklilik yaşı: 60
		// 65 - benim yaşım yani this.retirementAge - calculateAge()
		// bu bana emekliliğime kalan yılı gösterdi
	}
	
}