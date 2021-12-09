package marathon.school.project;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

public class People implements Serializable {
	private static final long serialVersionUID = -6378560150887247429L;
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String marriageStatus;
	private LocalDate birthDay;
	private LocalDate startingDay;
	private LocalDate finalDay;
	
	public People() {
		// TODO Auto-generated constructor stub
	}
	
	public People(String firstName, String middleName, String lastName, String gender, String marriageStatus,
			LocalDate birthDay, LocalDate startingDay, LocalDate finalDay) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.marriageStatus = marriageStatus;
		this.birthDay = birthDay;
		this.startingDay = startingDay;
		this.finalDay = finalDay;
	}
	
	public SimpleDateFormat day() {
		
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", locale);
		
		return simpleDateFormat;
	}
	
	@Override
	public String toString() {
		return "CommonSpecification [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", gender=" + gender + ", marriageStatus=" + marriageStatus + ", birthDay=" + birthDay
				+ ", startingDay=" + startingDay + ", finalDay=" + finalDay + "]";
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
//	public String getFullName() {
//		String emptySpace = this.middleName.equals("") ? " " : " " + middleName + " ";
//		return this.firstName + emptySpace + this.lastName;
//		return this.firstName + " " + this.lastName;
//		return this.firstName + " " + middleName + " " + this.lastName;
//	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getMarriageStatus() {
		return marriageStatus;
	}
	
	public void setMarriageStatus(String marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	
	public LocalDate getBirthDay() {
		return birthDay;
	}
	
	public LocalDate getStartingDay() {
		return startingDay;
	}
	
	public LocalDate getFinalDay() {
		return finalDay;
	}
	
	public void setFinalDay(LocalDate finalDay) {
		this.finalDay = finalDay;
	}
	
}
