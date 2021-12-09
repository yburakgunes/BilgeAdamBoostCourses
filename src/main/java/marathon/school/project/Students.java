package marathon.school.project;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Students extends People implements Serializable {
	private static final long serialVersionUID = 3073903047004295128L;
	
	public static int studentcount = 0;
	private String registerDate;
	private String idNumber;
	private String parentNumber;
	private String homeNumber;
	private String cellNumber;
	private Courses courses;
	private List<Courses> courseList;
	
	public Students() {
		this.idNumber = String.format("T-%03d", studentcount++);
	}
	
	public Students(String firstName, String middleName, String lastName, String gender, String marriageStatus,
			LocalDate birthDay, LocalDate startingDay, LocalDate finalDay, String registerDate, String idNumber,
			String parentNumber, String homeNumber, String cellNumber) {
		super(firstName, middleName, lastName, gender, marriageStatus, birthDay, startingDay, finalDay);
		this.registerDate = registerDate;
		this.idNumber = idNumber;
		this.parentNumber = parentNumber;
		this.homeNumber = homeNumber;
		this.cellNumber = cellNumber;
	}
	
	@Override
	public String toString() {
		return "SchoolStudents [registerDate=" + registerDate + ", idNumber=" + idNumber + ", parentNumber="
				+ parentNumber + ", homeNumber=" + homeNumber + ", cellNumber=" + cellNumber + ", getFirstName()="
				+ getFirstName() + ", getMiddleName()=" + getMiddleName() + ", getLastName()=" + getLastName()
				+ ", getGender()=" + getGender() + ", getMarriageStatus()=" + getMarriageStatus() + ", getBirthDay()="
				+ getBirthDay() + ", getStartingDay()=" + getStartingDay() + ", getFinalDay()=" + getFinalDay() + "]";
	}
	
	public String getRegisterDate() {
		return registerDate;
	}
	
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getParentNumber() {
		return parentNumber;
	}
	
	public void setParentNumber(String parentNumber) {
		this.parentNumber = parentNumber;
	}
	
	public String getHomeNumber() {
		return homeNumber;
	}
	
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	
	public String getCellNumber() {
		return cellNumber;
	}
	
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
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
