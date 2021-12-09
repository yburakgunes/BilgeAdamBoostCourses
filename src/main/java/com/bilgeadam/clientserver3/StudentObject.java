package com.bilgeadam.clientserver3;

import java.io.Serializable;

public class StudentObject implements Serializable{
	private static final long serialVersionUID = -2990592693425481860L;
	
	private int id;
	private String studentName;
	
	public StudentObject() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentObject(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "StudentObject [id=" + id + ", studentName=" + studentName + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
