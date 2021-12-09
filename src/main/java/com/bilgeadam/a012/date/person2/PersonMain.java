package com.bilgeadam.a012.date.person2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class PersonMain {
	private static int count = 0;
	private static Scanner klavye = new Scanner(System.in);
	
	// method
	
	public static void personGeneral() {
		Person person = new Person();
		int birthYear = 0, birthMonth = 0, birthDay = 0;
		try {
			System.out.println("Lütfen adınızı giriniz: ");
			person.setPersonName(klavye.nextLine());
			
			System.out.println("Lütfen soyadınızı giriniz: ");
			person.setPersonSurname(klavye.nextLine());
			
			System.out.println("Lütfen doğum yılınızı giriniz: ");
			birthYear = klavye.nextInt();
			
			System.out.println("Lütfen doğum ayınızı giriniz: ");
			birthMonth = klavye.nextInt();
			
			System.out.println("Lütfen doğum gününüzü giriniz: ");
			birthDay = klavye.nextInt();
			
			// klavye okumasını doğru yapsın diye
			klavye.nextLine();
			
			for (EGender name : EGender.values()) {
				System.out.println(name);
			}
			
			System.out.println("Lütfen cinsiyetinizi giriniz: ");
			person.setPersonGender(klavye.nextLine());
			
			// deadlock
			
			if (person.getPersonGender().equals(EGender.Bay.toString())) {
				Calendar calendar = Calendar.getInstance();
				person.setRetiredDate(LocalDate.of(birthYear + 65, birthMonth, birthDay));
				
				person.setNowDate(LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
						calendar.get(Calendar.DAY_OF_MONTH)));
				
				Male male = new Male(1, person.getPersonName(), person.getPersonSurname(), person.getPersonGender(),
						person.getRetiredDate(), person.getNowDate(), "Çok çalışmak", "Çok güçlü");
				
				differenceBetweenDates(male);
				
			} else if (person.getPersonGender().equals(EGender.Bayan.name())) {
				Calendar calendar = Calendar.getInstance();
				person.setRetiredDate(LocalDate.of(birthYear + 60, birthMonth, birthDay));
				
				person.setNowDate(LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
						calendar.get(Calendar.DAY_OF_MONTH)));
				
				Lady lady = new Lady(1, person.getPersonName(), person.getPersonSurname(), person.getPersonGender(),
						person.getRetiredDate(), person.getNowDate(), "Çok ikna edici", "Çok güzel");
				
				differenceBetweenDates(lady);
				
			}
			
		} catch (Exception e) {
			
		}
		
	}
	
	// Bu metotta göndereceğim parametre Lady Lady' göre Male Male'e göre işlem
	// yapmamız lazım
	private static void differenceBetweenDates(Object object) {
		// C.D.I
		// object Male classından mı türetilmiş
		
		if (object instanceof Male) {
			
			// casting: Object
			Male male = (Male) object;
			Period different = Period.between(male.getNowDate(), male.getRetiredDate());
			System.out.println("Emekliliğinize kalan süre: " + different.getYears() + " yıl" + different.getMonths()
					+ " ay" + different.getDays() + " gün kaldı.");
		} else if (object instanceof Lady) {
			// casting: Object
			Lady lady = (Lady) object;
			Period different = Period.between(lady.getNowDate(), lady.getRetiredDate());
			System.out.println("Emekliliğinize kalan süre: " + different.getYears() + " yıl" + different.getMonths()
					+ " ay" + different.getDays() + " gün kaldı.");
		}
		
	}
	
	public static void main(String[] args) {
		personGeneral();
	}
}
