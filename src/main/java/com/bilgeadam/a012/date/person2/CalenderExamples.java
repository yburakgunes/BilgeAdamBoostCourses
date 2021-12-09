package com.bilgeadam.a012.date.person2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalenderExamples {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar);
		
		
		//Date'i çevirecek getTime()
//		System.out.println(calendar.getTime());
//		System.out.println(calendar.getTime().getTime());
		
//		calendar.set(Calendar.YEAR, 2010);
//		System.out.println(calendar.getTime());
//		calendar.set(Calendar.MONTH, 1);
//		System.out.println(calendar.getTime());
		
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", locale);
		
		String str = simpleDateFormat.format(calendar.getTime());
		System.out.println(str);
		
	}
}
