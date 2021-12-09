package com.bilgeadam.boost.javacourse01.lesson31;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Officer extends Employee implements Accountable{

	private static final long serialVersionUID = 1L;
	public Officer(Name name, Gender gender, CivilStatus marriageStatus, LocalDate birthDate, LocalDate startDate, double startSalary) {
		super(name, gender, marriageStatus, birthDate, startDate, startSalary);
	}

	@Override
	public void setRegistrationNumber() {
		String regNumber = String.format("%03d", ++Employee.numOfEmployees);
		this.setRegistrationNumber("Ö-"+regNumber);
	}

	@Override
	public double currentSalary() {
		double currSalary = this.getStartSalary();
		LocalDate currDate;
		if (this.isOldEmployee()) 
			currDate = this.getEndDate();
		else
			currDate = LocalDate.now();
		long duration = this.getStartDate().until(currDate, ChronoUnit.MONTHS);
		int numberOfSalaryIncreases = (int)duration / 6;
		for (int i = 0; i < numberOfSalaryIncreases; i++) {
			currSalary += currSalary*9.0/100.0;
		}
			
		return currSalary;
	}

	@Override
	public String toString() {
		String curSal = String.format("%.2f", this.currentSalary());
		return "Memur.    [" + this.getRegistrationNumber() + " "  + this.getName() + " "  + this.getBirthDate() + " "  + this.getStartDate() + " "  + this.getStartSalary() + " "  + curSal    + "]";
	}
	@Override
	public void getMaried() {
		this.marriageStatus = CivilStatus.MARRIED;
		
	}

	
}
