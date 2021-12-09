package com.bilgeadam.boost.javacourse01.lesson26;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.YearMonth;
import java.time.ZonedDateTime;

public class TimeTester {
	
	public static void main(String[] args) {
		
		System.out.println("\nYerel Zaman                :" + LocalTime.now().toString());
		System.out.println("\nYerel tarih ve zaman       :" + LocalDateTime.now().toString());
		System.out.println("\nSaat dilimli tarih ve zaman:" + ZonedDateTime.now().toString());
		System.out.println("\nOfsetli zaman              :" + OffsetTime.now().toString());
		System.out.println("\nOfsetli tarih ve zaman     :" + OffsetDateTime.now().toString());
		System.out.println("\nAy ve gün                  :" + MonthDay.now().toString());
		System.out.println("\nYıl ve Ay                  :" + YearMonth.now().toString());
		System.out.println("\nAnlık                      :" + Instant.now().toString());
		
		System.out.println();
	}
	
}
