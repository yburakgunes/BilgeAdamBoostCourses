package marathon.school.project;

import java.time.LocalDate;

public class PeopleList {
	
	public static School school;
	
	public PeopleList() {
		school = new School("Çamlıca Lisesi", "Pürtelaş Hasan Efendi Mahallesi");
		newPeople();
		// birthDaythisMonth();
		// exWorkers();
		// showList();
	}
	
	public static void newPeople() {
		W_Teachers teacher1 = new W_Teachers("Naci", "Metin", "Şengül", EGenderSchool.ERKEK.name(), "Evli",
				LocalDate.parse("16.03.1993", Constants.dateTimeFormatter),
				LocalDate.parse("21.04.2015", Constants.dateTimeFormatter), null, 5000.0, "05369436131", "02566142325",
				null);
		teacher1.setSchool(school);
		teacher1.getSchool().getEmployeeList().add(teacher1);
		
		W_Teachers teacher2 = new W_Teachers("Burak", null, "Güneş", EGenderSchool.ERKEK.name(), "Bekar",
				LocalDate.parse("12.01.1990", Constants.dateTimeFormatter),
				LocalDate.parse("21.04.2019", Constants.dateTimeFormatter), null, 4000.0, "05369436131", "02566142325",
				null);
		teacher2.setSchool(school);
		teacher2.getSchool().getEmployeeList().add(teacher2);
		
		W_Teachers teacher3 = new W_Teachers("Nesrin", "Gonca", "Güneş", EGenderSchool.KADIN.name(), "Evli",
				LocalDate.parse("28.06.1960", Constants.dateTimeFormatter),
				LocalDate.parse("17.11.2005", Constants.dateTimeFormatter),
				LocalDate.parse("01.02.2017", Constants.dateTimeFormatter), 10000.0, "05369436131", "02566142325",
				null);
		teacher3.setSchool(school);
		teacher3.getSchool().getEmployeeList().add(teacher3);
		
		W_Teachers teacher4 = new W_Teachers("Babür", "Hamit", "Somer", EGenderSchool.KADIN.name(), "Evli",
				LocalDate.parse("28.06.1960", Constants.dateTimeFormatter),
				LocalDate.parse("01.06.2021", Constants.dateTimeFormatter), null, 13000.0, "05369436131", "02566142325",
				null);
		teacher4.setSchool(school);
		teacher4.getSchool().getEmployeeList().add(teacher4);
		
		Courses course1 = new Courses("Biyoloji", "2015", teacher1, teacher2, "3 saat",
				"Pazartesiden Perşembeye saat 13:00-16:30 arası");
		teacher1.setCourses(course1);
		teacher1.getCourses().getTeachers().add(teacher1);
		teacher2.setCourses(course1);
		teacher2.getCourses().getTeachers().add(teacher2);
		
		Courses course2 = new Courses("Matematik", "2018", teacher4, teacher1, "2 saat",
				"Salıdan Cumaya saat 11:00-13:00 arası");
		teacher4.setCourses(course2);
		teacher4.getCourses().getTeachers().add(teacher4);
		teacher1.setCourses(course2);
		teacher1.getCourses().getTeachers().add(teacher1);
		
		Courses course3 = new Courses("Felsefe", "2013", teacher2, teacher4, "6 saat",
				"Pazartesi-Çarşamba-Perşembe 9:00-15:00 arası");
		teacher2.setCourses(course2);
		teacher2.getCourses().getTeachers().add(teacher2);
		teacher4.setCourses(course2);
		teacher4.getCourses().getTeachers().add(teacher4);
		
		W_Officers officer1 = new W_Officers("Hamit", "Recep", "Altıntop", EGenderSchool.ERKEK.name(), "Evli",
				LocalDate.parse("15.02.1990", Constants.dateTimeFormatter),
				LocalDate.parse("21.04.2017", Constants.dateTimeFormatter), null, 3000.0, "05369436131", "02566142325",
				null);
		officer1.setSchool(school);
		officer1.getSchool().getEmployeeList().add(officer1);
		
		W_Officers officer2 = new W_Officers("Tuana", null, "Sakarya", EGenderSchool.KADIN.name(), "Bekar",
				LocalDate.parse("12.01.1990", Constants.dateTimeFormatter),
				LocalDate.parse("13.10.2011", Constants.dateTimeFormatter), null, 2500.0, "05369436131", "02566142325",
				null);
		officer2.setSchool(school);
		officer2.getSchool().getEmployeeList().add(officer2);
		
		W_Officers officer3 = new W_Officers("İlayda", "Semiramis", "Güneş", EGenderSchool.KADIN.name(), "Evli",
				LocalDate.parse("28.10.1960", Constants.dateTimeFormatter),
				LocalDate.parse("17.11.2005", Constants.dateTimeFormatter), null, 1000.0, "05369436131", "02566142325",
				null);
		officer3.setSchool(school);
		officer3.getSchool().getEmployeeList().add(officer3);
		
		W_Employees employee1 = new W_Employees("Ülkü", "Ülkünç", "Ülker", EGenderSchool.ERKEK.name(), "Evli",
				LocalDate.parse("08.08.1988", Constants.dateTimeFormatter),
				LocalDate.parse("11.12.2015", Constants.dateTimeFormatter), null, 3000.0, "05369436131", "02566142325",
				null);
		employee1.setSchool(school);
		employee1.getSchool().getEmployeeList().add(employee1);
		W_Employees employee2 = new W_Employees("Recep", null, "Erdoğan", EGenderSchool.KADIN.name(), "Bekar",
				LocalDate.parse("11.01.1972", Constants.dateTimeFormatter),
				LocalDate.parse("10.09.2008", Constants.dateTimeFormatter), null, 2500.0, "05369436131", "02566142325",
				null);
		employee2.setSchool(school);
		employee2.getSchool().getEmployeeList().add(employee2);
		
		W_Employees employee3 = new W_Employees("Berat", "Sami", "Albayrak", EGenderSchool.KADIN.name(), "Evli",
				LocalDate.parse("28.06.1971", Constants.dateTimeFormatter),
				LocalDate.parse("17.11.2013", Constants.dateTimeFormatter),
				LocalDate.parse("17.11.2018", Constants.dateTimeFormatter), 1000.0, "05369436131", "02566142325", null);
		employee3.setSchool(school);
		employee3.getSchool().getEmployeeList().add(employee3);
		
		Students student1 = new Students("Recep", "Tayyip", "Erdoğan", EGenderSchool.ERKEK.name(), "Bekar",
				LocalDate.parse("13.07.1999", Constants.dateTimeFormatter),
				LocalDate.parse("11.11.2019", Constants.dateTimeFormatter), null, "2019", null, "053555351313",
				"02442221133", "05322156482");
		student1.setCourses(course1);
		student1.getCourses().getStudents().add(student1);
		student1.setCourses(course2);
		student1.getCourses().getStudents().add(student1);
		student1.setCourses(course3);
		student1.getCourses().getStudents().add(student1);
		
		Students student2 = new Students("Deniz", "Kum", "Güneş", EGenderSchool.ERKEK.name(), "Bekar",
				LocalDate.parse("13.09.1998", Constants.dateTimeFormatter),
				LocalDate.parse("10.01.2021", Constants.dateTimeFormatter), null, "2021", null, "05067415684",
				"02586457845", "05336589878");
		student2.setCourses(course1);
		student2.getCourses().getStudents().add(student2);
		student2.setCourses(course2);
		student2.getCourses().getStudents().add(student2);
		student2.setCourses(course3);
		student2.getCourses().getStudents().add(student2);
		
		Students student3 = new Students("Mehmet", "Akif", "Derssoy", EGenderSchool.ERKEK.name(), "Bekar",
				LocalDate.parse("19.04.1998", Constants.dateTimeFormatter),
				LocalDate.parse("07.08.2020", Constants.dateTimeFormatter), null, "2020", null, "05322556666",
				"02566747474", "05307897595");
		student3.setCourses(course1);
		student3.getCourses().getStudents().add(student3);
		student3.setCourses(course3);
		student3.getCourses().getStudents().add(student3);
		
		Students student4 = new Students("Uykucu", "Uyur", "Uyumaz", EGenderSchool.ERKEK.name(), "Bekar",
				LocalDate.parse("08.08.1998", Constants.dateTimeFormatter),
				LocalDate.parse("05.12.2016", Constants.dateTimeFormatter), null, "2016", null, "05322699669",
				"05445456585", "05073211568");
		student4.setCourses(course2);
		student4.getCourses().getStudents().add(student4);
		student4.setCourses(course2);
		student4.getCourses().getStudents().add(student4);
		
	}
	
	public static void birthDaythisMonth() {
		
		System.out.println("Bu ay içerisinde doğum günü olanlar: ");
		school.getEmployeeList().stream()
				.filter(i -> i.getBirthDay().getMonthValue() == LocalDate.now().getMonthValue())
				.forEach(s -> System.out.println(s));
		System.out.println("Bu ay içerisinde işe başlamış olanlar olanlar: ");
		school.getEmployeeList().stream()
				.filter(i -> i.getStartingDay().getMonthValue() == LocalDate.now().getMonthValue())
				.forEach(s -> System.out.println(s));
		
	}
	
	public static void exWorkers() {
		
		System.out.println("İşten ayrılmış kişilerin listesi: ");
		
		school.getEmployeeList().stream().filter(i -> i.getFinalDay() != null).forEach(s -> System.out.print(s));
	}
	
	public static void showList() {
		for (Workers temp : school.getEmployeeList()) {
			System.out.println(temp);
		}
		
	}
	
	public static void salary() {
		
	}
	
	public static void main(String[] args) {
		PeopleList temp = new PeopleList();
		
		exWorkers();
		
	}
}
