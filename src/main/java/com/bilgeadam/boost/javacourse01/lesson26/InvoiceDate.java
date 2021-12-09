package com.bilgeadam.boost.javacourse01.lesson26;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class InvoiceDate {
	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
		LocalDate shoppingDay = LocalDate.of(2021, Month.DECEMBER, 17);
		LocalDate invoiceDate = LocalDate.of(shoppingDay.getYear(), shoppingDay.getMonth(), 15);
		
		if(shoppingDay.getDayOfMonth()>15) {
			invoiceDate = invoiceDate.plusMonths(1);
		}
		
		long daysToInvoice = shoppingDay.until(invoiceDate, ChronoUnit.DAYS);
		
		System.out.println("Fatura tarihi: " + invoiceDate);
		System.out.println("Faturalamaya " + daysToInvoice + " gün kaldı");
		
		System.out.println(shoppingDay.getYear());
		System.out.println(shoppingDay.getDayOfYear());
		
	}
}
