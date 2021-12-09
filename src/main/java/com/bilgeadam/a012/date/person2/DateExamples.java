package com.bilgeadam.a012.date.person2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateExamples {
	
	public static void main(String[] args) {
		// epoch time çağ zamanı:1 Ocak 1970
		long epochTime = System.currentTimeMillis();
		// System.out.println(epochTime);
		
		System.out.println();
		
		// Date:aylarda Sıfırda Başlar,
		Date date = new Date(epochTime);
		System.out.println(date);
		
		// 1900 tabanlıdır +-1900
		// Deprecated (Amerikalılar kullanır)
		// Java geriye uyumlulukta bir sıkıntı olmadan çalışır. Backward
		
		// 1900 ya ekleyeceğiz ya da çıkaracağız
		
		// 2021-1900 = 121
		// Date date2= new Date();
		// System.out.println(date2);
		
		// Gregorian calender (Miladi Takvim)
		
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", locale);
		
		Date date2 = new Date();
		String str = simpleDateFormat.format(date2);
		System.out.println(str);
		
	}
}
