package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_009_cast2 {
	
	public static void main(String[] args) {

//		null ==>
//		s�f�r
//		boxing unboxing nedir?
		// primitive type:
		// int sayi =5;
		// wrapper class
		// kullan�c�dan alm�� oldu�umuz byte t�r�ndeki primitive say�y� boxing yapaca��z
		
		Scanner klavye = new Scanner(System.in);
		System.out.print("L�tfen bir say� giriniz: ");
		byte sayi1 = klavye.nextByte();
		byte sayi2 = Byte.valueOf(sayi1);
		System.out.println("Sonu�: "+ sayi2);
		
		//unboxing
		Long wrapperSayi = new Long(44);
		long primitiveSayi= wrapperSayi;
	}
	
}
