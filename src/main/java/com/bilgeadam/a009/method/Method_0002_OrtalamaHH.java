package com.bilgeadam.a009.method;

import java.util.Scanner;

// kullan�c� taraf�ndan girilen say�n�n ortalamas� als�n
// ortalama 10'dan b�y�kse B�y�k desin de�ilse k���k desin.

public class Method_0002_OrtalamaHH {
	
	public static void returnAverage() {
		int sayi1 = 1, sayi2 = 2, sayi3 = 3, sayi4 = 4;
		System.out.println((sayi1 + sayi2 + sayi3 + sayi4) / 4);
	}
	
	public static void returnAverage(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println((sayi1 + sayi2 + sayi3 + sayi4) / 4);
	}
	
	public static void returnAverage2() {
		Scanner klavye = new Scanner(System.in);
		int sayi1;
		double toplam = 0, ortalamasi = 0.0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Lütfen " + (i + 1) + " sayıları giriniz");
			sayi1 = klavye.nextInt();
			toplam += sayi1;
			ortalamasi = toplam / (i + 1);
		}
		System.out.println(ortalamasi);
	}
	
	public static double returnAverage3() {
		Scanner klavye = new Scanner(System.in);
		int sayi1;
		double toplam = 0, ortalamasi = 0.0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Lütfen "  + (i + 1) + " sayıları giriniz");
			sayi1 = klavye.nextInt();
			toplam += sayi1;
			ortalamasi = toplam / (i + 1);
		}
		return ortalamasi;
	}
	
	public static void main(String[] args) {
		// returnAverage();
		// returnAverage(1, 2, 3, 4);
		// returnAverage2();
		double result = returnAverage3();
		if (Math.round(result) >= 10) {
			System.out.println("sayınız 10 veya 10'dan büyüktür");
		} else {
			System.out.println("sayınız 10'dan küçüktür");
		}
		
	}
}
