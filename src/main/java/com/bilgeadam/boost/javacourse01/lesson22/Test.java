package com.bilgeadam.boost.javacourse01.lesson22;

public class Test {
	
	public static void main(String[] args) {
		Person pers1 = new Student(12512512, Gender.OTHER, "Burak", "Güneş");
		Student pers2 = new Student(12512512, Gender.OTHER, "Burak", "Güneş");
		
		pers2.addCourse(null);
		Employee pers3 = new Employee(12512512, Gender.OTHER, "Burak", "Güneş", 2000, true);
		System.out.println(pers1);
		pers1.setAge(28);
		// pers1.setPersonMiddleName("Yusuf");
		System.out.println(pers1);
		
		System.out.println(pers1.getName().getFullName());
	}
	
}
