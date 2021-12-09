package com.bilgeadam.boost.javacourse01.lesson22;

public abstract class Student extends Person{
	
	private String [] courses;
	private int numOfCourses;

	public Student(long identityNumber, Gender gender, String firstName, String lastName) {
		super(identityNumber, gender, firstName, lastName);
		this.courses = new String [10];
		this.numOfCourses = 0;
	}
	
	public void addCourse(String courseName) {
		
		this.courses[this.numOfCourses] = courseName;
		this.numOfCourses++;
		
	}
	
	
	
}
