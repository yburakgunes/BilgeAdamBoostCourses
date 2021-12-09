package marathon.school.project;

import java.io.Serializable;
import java.time.LocalDate;

public class W_Officers extends Workers implements Serializable {
	
	private static final long serialVersionUID = -7891373335961049480L;
	
	private String regId;
	
	public W_Officers() {
		this.regId = String.format("O-%03d", workercount += workercount);
	}
	
	public W_Officers(String firstName, String middleName, String lastName, String gender, String marriageStatus,
			LocalDate birthDay, LocalDate startingDay, LocalDate finalDay, double salary, String cellNumber,
			String homeNumber, String regId) {
		super(firstName, middleName, lastName, gender, marriageStatus, birthDay, startingDay, finalDay, salary,
				cellNumber, homeNumber);
		this.regId = String.format("O-%03d", workercount += workercount);
		
	}
	
	public W_Officers(String regId, String firstName, String middleName, String lastName) {
		super();
	}
	
	@Override
	public String toString() {
		return "W_Officers [regId=" + regId + ", getCellNumber()=" + getCellNumber() + ", getSalary()=" + getSalary()
				+ ", getFirstName()=" + getFirstName() + ", getMiddleName()=" + getMiddleName() + ", getLastName()="
				+ getLastName() + ", getGender()=" + getGender() + ", getMarriageStatus()=" + getMarriageStatus()
				+ ", getBirthDay()=" + getBirthDay() + ", getStartingDay()=" + getStartingDay() + ", getFinalDay()="
				+ getFinalDay() + "]";
	}
	
	public String getRegId() {
		return regId;
	}
	
	public void setRegId(String regId) {
		this.regId = regId;
	}
	
}
