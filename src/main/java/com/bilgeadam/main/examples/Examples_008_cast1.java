package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_008_cast1 {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz: ");
		String sayi1=klavye.nextLine();
		int sayi2=Integer.parseInt(sayi1);
		int sonuc = (int) Math.sqrt(Math.pow(sayi2, 2));
		
		System.out.println("Ýþlemin sonucu: " + sonuc);
		
	}
	
}
