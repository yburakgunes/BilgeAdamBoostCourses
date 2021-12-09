package com.bilgeadam.boost.javacourse01.lesson31;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;

public class SchoolManagement implements Serializable{
	private static final long serialVersionUID = 1L;
	private ArrayList<Employee> employees;
	private HashMap<String, Teacher> teachers;
	private HashMap<String, Student> students;
	private HashMap<String, LecturingClass> classes;
	
	public SchoolManagement() {
		this.employees = new ArrayList<>();
		this.teachers = new HashMap<>();
		this.students = new HashMap<>();
		this.classes = new HashMap<>();
	}

	public HashMap<Integer, String> initMenu() {
		HashMap<Integer, String> menu = new HashMap<Integer, String>();
		
		Locale locale = new Locale(SchoolManagementSystem.getDesiredLanguage());
		ResourceBundle languageBundle = ResourceBundle.getBundle("com.bilgeadam.boost.java.lesson31.texts", locale);

		menu.put(1, languageBundle.getString("SCHOOL_MANAGEMENT_SYSTEM.NEW_EMPLOYEE"));
		menu.put(2, languageBundle.getString("SCHOOL_MANAGEMENT_SYSTEM.EMPLOYEE_LIST"));
		menu.put(3, languageBundle.getString("SCHOOL_MANAGEMENT_SYSTEM.OLD_EMPLOYEES"));
		menu.put(4, languageBundle.getString("SCHOOL_MANAGEMENT_SYSTEM.NEW_CLASS"));
		menu.put(5, languageBundle.getString("SCHOOL_MANAGEMENT_SYSTEM.ASSIGN_STUDENTS"));
		menu.put(6, languageBundle.getString("SCHOOL_MANAGEMENT_SYSTEM.LIST_OF_CLASSES"));
		menu.put(7, languageBundle.getString("SCHOOL_MANAGEMENT_SYSTEM.CLASSES_OF_STUDENT"));
		menu.put(8, languageBundle.getString("SCHOOL_MANAGEMENT_SYSTEM.GIFT_LIST"));
		menu.put(9, languageBundle.getString("SCHOOL_MANAGEMENT_SYSTEM.WAGE_LIST"));
		menu.put(10, languageBundle.getString("SCHOOL_MANAGEMENT_SYSTEM.EXIT_APPLICATION"));
		return menu;
	}

	private void salaryInfo() {
		for (Employee employee : employees) {
			if (!employee.isOldEmployee()) {
				System.out.println(employee.getName() + " -- " + employee.currentSalary());
			}
		}
	}

	private void giftRecipients() {
		LocalDate currDate = LocalDate.now();
		for (Employee employee : employees) {
			if (!employee.isOldEmployee()) {
				if (employee.getBirthDate().getMonth().getValue() == currDate.getMonth().getValue() && employee.getGender() == Gender.WOMAN)
					System.out.println("Doğumgünü hediyesi: " + employee.getName());
				if (employee.getStartDate().getMonth().getValue() == currDate.getMonth().getValue())
					System.out.println("İş yıldönümü hediyesi: " + employee.getName());
			}
		}
	}

	private void studentsClasses() {
		Set<Map.Entry<String, Student>>  classSet = this.students.entrySet();
		
		for (Entry<String, Student> entry : classSet) {
			Student st = entry.getValue();
			System.out.println(st);
			
			Iterator<LecturingClass> classes = st.getClasses().iterator();
			while (classes.hasNext()) {
				LecturingClass cl = (LecturingClass) classes.next();
				System.out.println(cl);
			}
			System.out.println("========================");
		}
	}

	private void studentList() {
		Set<Map.Entry<String, LecturingClass>>  classSet = this.classes.entrySet();
		for (Entry<String, LecturingClass> entry : classSet) {
			LecturingClass cl = entry.getValue();
			System.out.println(cl);
			
			Iterator<Student> students = cl.getStudents().iterator();
			while (students.hasNext()) {
				Student student = (Student) students.next();
				System.out.println(student);
			}
			System.out.println("========================");
		}
	}

	private void assignStudent() {
		LecturingClass l1 = this.classes.get("Ders 1");
		LecturingClass l2 = this.classes.get("Ders 2");
		LecturingClass l3 = this.classes.get("Ders 3");
		Student s1 = new Student(new Name("Student", "1"), Gender.MAN, LocalDate.parse("2006-11-10"), LocalDate.parse("2020-09-01"));
		this.students.put("2020-0001", s1);
		Student s2 = new Student(new Name("Student", "2"), Gender.WOMAN, LocalDate.parse("2005-12-11"), LocalDate.parse("2019-09-01"));
		this.students.put("2019-0002", s2);
		Student s3 = new Student(new Name("Student", "3"), Gender.WOMAN, LocalDate.parse("2008-01-12"), LocalDate.parse("2021-09-01"));
		this.students.put("2021-0003", s3);
		Student s4 = new Student(new Name("Student", "4"), Gender.WOMAN, LocalDate.parse("2006-07-13"), LocalDate.parse("2019-09-01"));
		this.students.put("2019-0004", s4);
		Student s5 = new Student(new Name("Student", "5"), Gender.MAN, LocalDate.parse("2006-11-14"), LocalDate.parse("2019-09-01"));
		this.students.put("2019-0005", s5);
		Student s6 = new Student(new Name("Student", "6"), Gender.MAN, LocalDate.parse("2005-06-15"), LocalDate.parse("2018-09-01"));
		this.students.put("2018-0006", s6);
		Student s7 = new Student(new Name("Student", "7"), Gender.WOMAN, LocalDate.parse("2006-02-16"), LocalDate.parse("2020-09-01"));
		this.students.put("2020-0007", s7);
		Student s8 = new Student(new Name("Student", "8"), Gender.WOMAN, LocalDate.parse("2007-12-17"), LocalDate.parse("2020-09-01"));
		this.students.put("2020-0008", s8);
		Student s9 = new Student(new Name("Student", "9"), Gender.MAN, LocalDate.parse("2006-11-18"), LocalDate.parse("2020-09-01"));
		this.students.put("2020-0009", s9);
		l1.addStudent(s1);
		s1.addTakenClass(l1);
		l1.addStudent(s3);
		s3.addTakenClass(l1);
		l1.addStudent(s4);
		s4.addTakenClass(l1);
		l1.addStudent(s7);
		s7.addTakenClass(l1);
		l1.addStudent(s8);
		s8.addTakenClass(l1);
		
		l2.addStudent(s1);
		s1.addTakenClass(l2);
		l2.addStudent(s3);
		s3.addTakenClass(l2);
		l2.addStudent(s4);
		s4.addTakenClass(l2);
		l2.addStudent(s7);
		s7.addTakenClass(l2);
		l2.addStudent(s8);
		s8.addTakenClass(l2);
		l2.addStudent(s2);
		s2.addTakenClass(l2);
		
		l3.addStudent(s5);
		s5.addTakenClass(l3);
		l3.addStudent(s6);
		s6.addTakenClass(l3);
		l3.addStudent(s9);
		s9.addTakenClass(l3);
		l3.addStudent(s1);
		s1.addTakenClass(l3);
		l3.addStudent(s8);
		s8.addTakenClass(l3);
		System.out.println("Öğrenciler sınıflara atandı");
	}

	private void newClass() {
		Teacher m1 = this.teachers.get("Ö-001");
		Teacher m2 = this.teachers.get("Ö-002");
		Teacher a1 = this.teachers.get("Ö-004");
		LecturingClass l1 = new LecturingClass("Ders 1", m1, a1, LocalDate.now().getYear(), 2, DayOfWeek.MONDAY, LocalTime.of(13, 30));
		LecturingClass l2 = new LecturingClass("Ders 2", m1, a1, LocalDate.now().getYear(), 4, DayOfWeek.THURSDAY, LocalTime.of(9, 0));
		LecturingClass l3 = new LecturingClass("Ders 3", m2, a1, LocalDate.now().getYear(), 3, DayOfWeek.WEDNESDAY, LocalTime.of(10, 0));
		this.classes.put(l1.getName(), l1);
		this.classes.put(l2.getName(), l2);
		this.classes.put(l3.getName(), l3);
		System.out.println("Sınıflar yaratıldı");
	}

	private void previousEmployeeList() {
		for (Employee employee : employees) {
			if (employee.isOldEmployee()) {
				System.out.println(employee);
			}
		}
	}

	private void newEmployee() {
		
		Teacher t1 = new Teacher(new Name("Babür", "Somer"), Gender.MAN, CivilStatus.MARRIED,
						LocalDate.of(1964, Month.DECEMBER, 19), LocalDate.of(2021, Month.JUNE, 15), 200);
		employees.add(t1);
		teachers.put(t1.getRegistrationNumber(), t1);
		Teacher t2 = new Teacher(new Name("Ali", "Veli"), Gender.MAN, CivilStatus.NOT_SPECIFIED,
						LocalDate.of(1978, Month.NOVEMBER, 19), LocalDate.of(2001, Month.JANUARY, 1), 210);
		employees.add(t2);
		teachers.put(t2.getRegistrationNumber(), t2);
		Teacher t3 = new Teacher(new Name("Ayşe", "Fatma"), Gender.WOMAN, CivilStatus.SINGLE,
						LocalDate.of(1985, Month.JANUARY, 19), LocalDate.of(2005, Month.MARCH, 6), 230);
		employees.add(t3);
		teachers.put(t3.getRegistrationNumber(), t3);
		t3.setEndDate(LocalDate.of(2021, Month.AUGUST, 23));
		Teacher t4 = new Teacher(new Name("Zeynep", "Elif"), Gender.WOMAN, CivilStatus.MARRIED,
						LocalDate.of(1990, Month.OCTOBER, 19), LocalDate.of(2021, Month.APRIL, 1), 240);
		employees.add(t4);
		teachers.put(t4.getRegistrationNumber(), t4);
		
		Worker w1 = new Worker(new Name("Worker", "One"), Gender.MAN, CivilStatus.MARRIED, 
						LocalDate.of(1991, Month.JANUARY, 1), LocalDate.of(2015, Month.JANUARY, 1), 50);
		employees.add(w1);
		Worker w2 = new Worker(new Name("Worker", "Old", "Two"), Gender.MAN, CivilStatus.SINGLE, 
						LocalDate.of(1992, Month.OCTOBER, 2), LocalDate.of(2016, Month.JANUARY, 1), 60);
		w2.setEndDate(LocalDate.of(2021, Month.DECEMBER, 31));
		employees.add(w2);
		Worker w3 = new Worker(new Name("Worker", "Old", "Three"), Gender.WOMAN, CivilStatus.NOT_SPECIFIED, 
						LocalDate.of(1993, Month.FEBRUARY, 3), LocalDate.of(2017, Month.JANUARY, 1), 70);
		w3.setEndDate(LocalDate.of(2021, Month.AUGUST, 23));
		employees.add(w3);
		Worker w4 = new Worker(new Name("Worker", "Four"), Gender.WOMAN, CivilStatus.DIVORCED, 
						LocalDate.of(1994, Month.OCTOBER, 4), LocalDate.of(2018, Month.NOVEMBER, 1), 80);
		employees.add(w4);
		
		Officer o1 = new Officer(new Name("Officer", "Old", "One"), Gender.WOMAN, CivilStatus.DIVORCED, 
						LocalDate.of(1995, Month.MARCH, 5), LocalDate.of(2019, Month.JANUARY, 1), 90);
		employees.add(o1);
		Officer o2 = new Officer(new Name("Officer", "Two"), Gender.MAN, CivilStatus.MARRIED, 
						LocalDate.of(1996, Month.APRIL, 6), LocalDate.of(2020, Month.OCTOBER, 1), 100);
		employees.add(o2);
		Officer o3 = new Officer(new Name("Officer", "Old", "Three"), Gender.WOMAN, CivilStatus.DOMESTIC_PARTNERSHIP, 
						LocalDate.of(1997, Month.OCTOBER, 7), LocalDate.of(2021, Month.JANUARY, 1), 110);
		employees.add(o3);
		o3.setEndDate(LocalDate.of(2021, Month.SEPTEMBER, 30));
		Officer o4 = new Officer(new Name("Officer", "Four"), Gender.WOMAN, CivilStatus.SINGLE, 
						LocalDate.of(1998, Month.MARCH, 8), LocalDate.of(2000, Month.OCTOBER, 1), 120);
		employees.add(o4);
		System.out.println("Çalışanlar yaratıldı");
	}

	private void employeeList() {
		for (Employee employee : employees) {
			if (!employee.isOldEmployee()) {
				System.out.println(employee);
			}
		}
	}

	public void processMenu(int selection) {
		
		switch (selection) {
		case 1:
			this.newEmployee();
			break;
		case 2:
			this.employeeList();
			break;
		case 3:
			this.previousEmployeeList();
			break;
		case 4:
			this.newClass();
			break;
		case 5:
			this.assignStudent();
			;
			break;
		case 6:
			this.studentList();
			break;
		case 7:
			this.studentsClasses();
			break;
		case 8:
			this.giftRecipients();
			break;
		case 9:
			this.salaryInfo();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + selection);
		}

	}
}
