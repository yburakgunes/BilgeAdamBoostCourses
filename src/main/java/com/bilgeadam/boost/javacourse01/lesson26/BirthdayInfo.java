package com.bilgeadam.boost.javacourse01.lesson26;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class BirthdayInfo {
	
	public static void main(String[] args) {
		
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Lütfen doğum günü tarihinizi giriniz: ");
		// String bday = scan.nextLine();
		
		BAUtils.header("Gereksiz Doğum günü Bilgileri");
		DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("MMMM dd");
		do {
			System.out.println("Bugün, " + LocalDate.now().format(fullFormat) + "\n");
			String aDate = BAUtils.readString("Lütfen doğum gününüzü (yyyy-mm-dd) formatında giriniz: ");
			LocalDate birthDay = LocalDate.parse(aDate);
			
			if (birthDay.isAfter(LocalDate.now())) {
				System.out.println("Daha doğmadınız");
				continue;
			}
			
			System.out.println("---- Bilgiler ----");
			System.out.println(birthDay.format(fullFormat) + " harika bir gündü. ");
			System.out.println("Bir " + birthDay.getDayOfWeek() + " günü doğdun");
			
			long days = birthDay.until(LocalDate.now(), ChronoUnit.DAYS);
			long weeks = birthDay.until(LocalDate.now(), ChronoUnit.WEEKS);
			long months = birthDay.until(LocalDate.now(), ChronoUnit.MONTHS);
			long years = birthDay.until(LocalDate.now(), ChronoUnit.YEARS);
			long decades = birthDay.until(LocalDate.now(), ChronoUnit.DECADES);
			long milleniums = birthDay.until(LocalDate.now(), ChronoUnit.MILLENNIA);
			
			System.out.println("Bugüne dek " + days + " gün, " + weeks + " hafta, " + months + " ay, " + years
					+ " yıl, " + decades + " onyıl ve " + milleniums + " binyıl yaşadı");
			
			LocalDate nextBdate = birthDay.plusYears(years + 1);
			System.out.println("Bir sonraki doğum gününüz " + birthDay.format(fullFormat));
			System.out.println(
					"Kutlamaya daha " + LocalDate.now().until(nextBdate, ChronoUnit.DAYS) + " beklemeniz gerekiyor");
			LocalDate halfBDate = birthDay.plusMonths(6);
			System.out.println("Yarım yaşlarınızı " + halfBDate.format(shortFormat) + " tarihinde kutluyorsunuz");
			
		} while (BAUtils.wantToEnd("Bir daha (Evet/Hayır)?", "Hayır"));
		
	}
	
}
