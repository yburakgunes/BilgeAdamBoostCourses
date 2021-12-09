package com.bilgeadam.boost.javacourse01.lesson26;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZoneIds {
	public static void main(String[] args) {
		// for (String zoneId : ZoneId.getAvailableZoneIds()) {
		// System.out.println(zoneId);
		//
		// }
		
		ZoneId zone = ZoneId.of("Turkey");
		ZonedDateTime dt = ZonedDateTime.of(LocalDateTime.of(2021, 10, 11, 9, 43), zone);
		System.out.println(dt);
		// ZonedDateTime dt = ZonedDateTime.of(2021, Month.OCTOBER, 11, 9, 12, zone);
		
		ZonedDateTime anotherDateTime = ZonedDateTime.of(LocalDateTime.of(2021, Month.DECEMBER, 19, 6, 45),zone);
		System.out.println("Gün sayısı: " + dt.until(anotherDateTime, ChronoUnit.HALF_DAYS));
	}
}
