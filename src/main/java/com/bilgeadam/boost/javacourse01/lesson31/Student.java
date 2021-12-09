package com.bilgeadam.boost.javacourse01.lesson31;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

public  class Student extends Person {
	private static final long serialVersionUID = 1L;

	protected static int numOfStudents = 0;

	private String registrationNumber;
	private LocalDate startDate;
	private LocalDate endDate;
	private ArrayList<LecturingClass> takenClasses;

	public Student(Name name, Gender gender, LocalDate birthDate, LocalDate startDate) {
		super(name, gender, CivilStatus.SINGLE, birthDate);
		this.startDate = startDate;
		this.endDate = LocalDate.MAX;
		this.setRegistrationNumber();
		this.telephonNumbers = new int[3];
		this.takenClasses = new ArrayList<>();
	}

	public int getCurrentClass() {
		return (int)this.getStartDate().until(LocalDate.now(),ChronoUnit.YEARS);
	}
	public void setRegistrationNumber() {
		String year = String.valueOf(this.getStartDate().getYear());
		String regNumber = String.format("%03d", ++Student.numOfStudents);
		if (Student.numOfStudents == 1000) {
			Student.numOfStudents = 1;
		}
		this.setRegistrationNumber(year + "-" + regNumber);
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public boolean isOldEmployee() {
		return this.endDate.isBefore(LocalDate.MAX);
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public LocalDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return this.endDate;
	}

	public void setHomePhone(int number) {
		this.setTelephonNumber(TELEPHONE_TYPE.HOME, number);
	}
	
	public void setCellPhone(int number) {
		this.setTelephonNumber(TELEPHONE_TYPE.CELLPHONE, number);
	}
	
	public void setGurdiansPhone(int number) {
		this.setTelephonNumber(TELEPHONE_TYPE.GUARDIAN, number);
	}


	@Override
	public String toString() {
		return "Öğrenci [Number=" + this.registrationNumber + ", Name=" + this.getName() + ", startDate=" + this.startDate +  ", takenClasses=" + this.takenClasses + ", currentYear="
						+ this.getCurrentClass() + ", telephonNumbers=" + Arrays.toString(this.telephonNumbers) + "]";
	}

	@Override
	public void getMaried() throws CannotGetMarriedException {
		throw new CannotGetMarriedException("A student cannot get married");
	}

	public ArrayList<LecturingClass> getClasses() {
		return this.takenClasses;
	}
	
	public void addTakenClass (LecturingClass cl) {
		this.takenClasses.add(cl);
	}
}
