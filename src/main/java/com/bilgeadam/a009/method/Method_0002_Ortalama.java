package com.bilgeadam.a009.method;

import java.util.Scanner;

public class Method_0002_Ortalama {
	
	public static void returnAverage() {
		int sayi1 = 1, sayi2 = 2, sayi3 = 3, sayi4 = 4;
		System.out.println(((sayi1 + sayi2 + sayi3 + sayi4) / 4));
		
	}
	
	public static void returnAverage(int sayi1, int sayi2, int sayi3, int sayi4) {
		
		System.out.println(((sayi1 + sayi2 + sayi3 + sayi4) / 4));
		
	}
	
	public static void returnAverage2() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen sayýlarý giriniz");
		int sayi1;
		double toplam = 0, ortalama = 0.0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Lütfen" + (i + 1) + "sayýlarý giriniz");
			sayi1 = klavye.nextInt();
			toplam += sayi1;
			ortalama = toplam / (i + 1);
		}
		System.out.println(ortalama);
	}
	
	public static void main(String[] args) {
		returnAverage();
		returnAverage(1, 2, 3, 4);
		returnAverage();
		
	}
}
