package com.bilgeadam.boost.javacourse01.lesson31;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.LinkedList;

public class LecturingClass implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private Teacher master;
	private Teacher assistant;
	private long year;
	private long duration;
	private DayOfWeek day;
	private LocalTime startTime;
	private LinkedList<Student> students;

	public LecturingClass(String name, Teacher master, Teacher assistant, long year, long duration, DayOfWeek day,
					LocalTime startTime) {
		super();
		this.name = name;
		this.master = master;
		this.assistant = assistant;
		this.year = year;
		this.duration = duration;
		this.day = day;
		this.startTime = startTime;
		this.students = new LinkedList<>();
	}

	public String getName() {
		return this.name;
	}

	public Teacher getMaster() {
		return this.master;
	}

	public Teacher getAssistant() {
		return this.assistant;
	}

	public long getYear() {
		return this.year;
	}

	public long getDuration() {
		return this.duration;
	}

	public DayOfWeek getDay() {
		return this.day;
	}

	public LocalTime getStartTime() {
		return this.startTime;
	}

	public LinkedList<Student> getStudents() {
		return this.students;
	}

	public void addStudent (Student student) {
		this.students.add(student);
	}

	@Override
	public String toString() {
		return "LecturingClass [name=" + this.name + ", master=" + this.master + ", assistant=" + this.assistant
						+ ", year=" + this.year + ", duration=" + this.duration + ", day=" + this.day + ", startTime="
						+ this.startTime + "]";
	}
}
