package marathon.school.project;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class W_Teachers extends Workers implements Serializable {
	
	private static final long serialVersionUID = -7891373335961049480L;
	
	private String regId;
	private Courses courses;
	private List<Courses> courseList;
	
	public W_Teachers() {
		this.regId = String.format("T-%03d", workercount += workercount);
	}
	
	public W_Teachers(String firstName, String middleName, String lastName, String gender, String marriageStatus,
			LocalDate birthDay, LocalDate startingDay, LocalDate finalDay, double salary, String cellNumber,
			String homeNumber, String regId) {
		super(firstName, middleName, lastName, gender, marriageStatus, birthDay, startingDay, finalDay, salary,
				cellNumber, homeNumber);
		this.regId = String.format("T-%03d", workercount += workercount);
	}
	
	public W_Teachers(String regId, String firstName, String middleName, String lastName) {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Teachers [regId=" + regId + ", courses=" + courses + ", getCellNumber()=" + getCellNumber()
				+ ", getHomeNumber()=" + getHomeNumber() + ", getSalary()=" + getSalary() + ", getFirstName()="
				+ getFirstName() + ", getMiddleName()=" + getMiddleName() + ", getLastName()=" + getLastName()
				+ ", getGender()=" + getGender() + ", getMarriageStatus()=" + getMarriageStatus() + ", getBirthDay()="
				+ getBirthDay() + ", getStartingDay()=" + getStartingDay() + ", getFinalDay()=" + getFinalDay() + "]";
	}
	
	public String getRegId() {
		return regId;
	}
	
	public void setRegId(String regId) {
		this.regId = regId;
	}
	
	public Courses getCourses() {
		return courses;
	}
	
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	
	public List<Courses> getCourseList() {
		return courseList;
	}
	
	public void setCourseList(List<Courses> courseList) {
		this.courseList = courseList;
	}
	
}
