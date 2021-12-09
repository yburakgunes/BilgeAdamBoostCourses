package marathon.school.project;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Workers extends People implements Serializable {
	private static final long serialVersionUID = 5344542592553550329L;
	
	public static int workercount = 0;
	private double salary;
	private String cellNumber;
	private String homeNumber;
	private School school;
	
	public Workers() {
		
	}
	
	public Workers(String firstName, String middleName, String lastName, String gender, String marriageStatus,
			LocalDate birthDay, LocalDate startingDay, LocalDate finalDay, double salary, String cellNumber,
			String homeNumber) {
		super(firstName, middleName, lastName, gender, marriageStatus, birthDay, startingDay, finalDay);
		this.salary = salary;
		this.cellNumber = cellNumber;
		this.homeNumber = homeNumber;
		
	}
	
	
	@Override
	public String toString() {
		return "Workers [salary=" + salary + ", cellNumber=" + cellNumber + ", homeNumber=" + homeNumber + ", school="
				+ school + ", getFirstName()=" + getFirstName() + ", getMiddleName()=" + getMiddleName()
				+ ", getLastName()=" + getLastName() + ", getGender()=" + getGender() + ", getMarriageStatus()="
				+ getMarriageStatus() + ", getBirthDay()=" + getBirthDay() + ", getStartingDay()=" + getStartingDay()
				+ ", getFinalDay()=" + getFinalDay() + "]";
	}
	
	public String getCellNumber() {
		return cellNumber;
	}
	
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}
	
	public String getHomeNumber() {
		return homeNumber;
	}
	
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	
	public School getSchool() {
		return school;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	
	public double getSalary() {
		return salary;
	}
	
}
