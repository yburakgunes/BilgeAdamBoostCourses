package marathon.school.project;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	private String courseName;
	private String courseYear;
	private W_Teachers mainTeacher;
	private W_Teachers subsTeacher;
	private List<W_Teachers> teachers;
	private List<Students> students;
	private String lessonHour;
	private String lessonSchedule;
	
	public Courses() {
		// TODO Auto-generated constructor stub
	}
	
	public Courses(String courseName, String courseYear, W_Teachers mainTeacher, W_Teachers subsTeacher,
			String lessonHour, String lessonSchedule) {
		super();
		this.courseName = courseName;
		this.courseYear = courseYear;
		this.mainTeacher = mainTeacher;
		this.subsTeacher = subsTeacher;
		this.lessonHour = lessonHour;
		this.lessonSchedule = lessonSchedule;
		this.teachers = new ArrayList<W_Teachers>();
		this.students = new ArrayList<Students>();
	}
	
	@Override
	public String toString() {
		return "Courses [name=" + courseName + ", courseDate=" + courseYear + "]";
	}
	
	public String getName() {
		return courseName;
	}
	
	public void setName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseDate() {
		return courseYear;
	}
	
	public void setCourseDate(String courseDate) {
		this.courseYear = courseDate;
	}
	
	public List<W_Teachers> getTeachers() {
		return teachers;
	}
	
	public void setTeachers(List<W_Teachers> teachers) {
		this.teachers = teachers;
	}
	
	public List<Students> getStudents() {
		return students;
	}
	
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseYear() {
		return courseYear;
	}
	
	public void setCourseYear(String courseYear) {
		this.courseYear = courseYear;
	}
	
	public W_Teachers getMainTeacher() {
		return mainTeacher;
	}
	
	public void setMainTeacher(W_Teachers mainTeacher) {
		this.mainTeacher = mainTeacher;
	}
	
	public W_Teachers getSubsTeacher() {
		return subsTeacher;
	}
	
	public void setSubsTeacher(W_Teachers subsTeacher) {
		this.subsTeacher = subsTeacher;
	}
	
	public String getLessonHour() {
		return lessonHour;
	}
	
	public void setLessonHour(String lessonHour) {
		this.lessonHour = lessonHour;
	}
	
	public String getLessonSchedule() {
		return lessonSchedule;
	}
	
	public void setLessonSchedule(String lessonSchedule) {
		this.lessonSchedule = lessonSchedule;
	}
	
}
