package com.bilgeadam.a014.classs.exceptionhandling;

import java.util.Scanner;

public class BurakGunesException extends Exception {
	private static final long serialVersionUID = 4754681970718794643L;
	
	public BurakGunesException(String errorMessage) {
		super(errorMessage);
	}
	
	public static void main(String[] args) throws BurakGunesException {
		System.out.println("Kendi istisna durumumu yaptım");
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen pozitif sayı giriniz: ");
		int sayi=klavye.nextInt();
		
		if(sayi<0) {
			throw new BurakGunesException("Number istisnası");
		} else {
			System.out.println("Girdiğiniz sayı: " + sayi);
		}
		
		
		
		
//		throw new BurakGunesException("Number istisnası");
		
		// System.out.println("Devam ediyor");
	}
}
