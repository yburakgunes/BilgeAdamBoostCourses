package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_007_cast {
	public static void main(String[] args) {
		
		String sayi1 = "4";
		// valueOf
		// ParseInt
		
		int yeniSayi1 = Integer.parseInt(sayi1);
		int yeniSayi2 = Integer.valueOf(sayi1);
		
		int sayi2 = 6;
		System.out.println(yeniSayi1 + sayi2);
		System.out.println(yeniSayi2 + sayi2);
		
		int sayi3 = 44;
		String sayi4 = String.valueOf(sayi3);
		System.out.println(sayi4+sayi2);
		String sayi5= Integer.toString(sayi3);
		
	}
}
