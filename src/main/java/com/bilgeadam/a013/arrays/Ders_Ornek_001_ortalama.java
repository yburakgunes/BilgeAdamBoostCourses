package com.bilgeadam.a013.arrays;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ders_Ornek_001_ortalama {
	// dizinin eleman sayısını kullanıcı girecek
	// 1 ile kullanıcının vermiş olduğu sayı aralığında sayıları random olarak
	// gelsin
	// toplamları
	// ortalaması
	// bu sayılardan kaç tane çift var?
	// kaç tane tek sayı
	// ana method static olsun diğer metotlar static olmasın
	
	// dizinin eleman sayısı
	public static int numberOfElement() {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Lütfen dizinin eleman sayısını giriniz: ");
		int number = klavye.nextInt();
		return number;
	}
	
	// rastgele için üst sayı giriniz
	public static int topNumber() {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Lütfen rastgele sayı için üst indisi giriniz: ");
		int number = klavye.nextInt();
		return number;
	}
	
	// random sayılar
	public static int[] randomArray() {
		// tek boyutlu dizi eleman sayısı
		int[] dizi = new int[numberOfElement()];
		
		// rastgele sayılar
		Random randomNumber = new Random();
		int topIndis = topNumber();
		int number;
		
		for (int i = 0; i < dizi.length; i++) {
			number = randomNumber.nextInt(topIndis) + 1;
			dizi[i] = number;
			
		}
		// for each döngüsü
		
		// for (int temp : dizi) {
		// System.out.println(temp + " ");
		//
		// }
		//
		return dizi;
	}
	
	public static void allElementArray() {
		// toplam
		int toplam = 0, tekSayilar = 0, ciftSayilar = 0;
		double ortalama = 0.0;
		
		// iterative = indis sayısı bize lazımsa
		int[] dizi = randomArray();
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i] + " ");
			toplam = toplam + dizi[i];
			if (dizi[i] % 2 == 0) {
				ciftSayilar++;
			} else {
				tekSayilar++;
			}
		}
		System.out.println("toplamları: " + toplam);
		System.out.println("ortalaması: " + (ortalama = toplam / (dizi.length - 1)));
		System.out.println("Dizideki tek sayılar: " + tekSayilar);
		System.out.println("Dizideki çift sayılar: " + ciftSayilar);
		System.out.println("Dizinin ilk elemanı: " + dizi[0]);
		System.out.println("Dizinin son elemanı: " + dizi[dizi.length - 1]);
		
		// for each = sadece ekranda göstermek için
		// for (int temp : dizi) {
		// System.out.println(temp+" ");
		// }
	}
	
	public static void tekSayilar() {
		
		int tekSayilar = 0;
		int[] dizi = randomArray();
		int[] tek = new int[dizi.length];
		
		for (int i = 0; i < dizi.length; i++) {
			
			if (dizi[i] % 2 == 1)
				tekSayilar++;
				dizi[i] = tek[i];
				System.out.println(tekSayilar);
			}
		System.out.println(tek[dizi.length]);
		
		}
		
	
	public static void ciftSayılar() {
		
		int ciftSayılar = 0;
		int[] dizi = randomArray();
		int[] cift = new int[ciftSayılar];
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i] + " ");
			
			if (dizi[i] % 2 == 0)
				ciftSayılar++;
			{
				dizi[i] = cift[i];
			}
		}
		
		System.out.println(cift[ciftSayılar]);
	}
	
	public static void primeNumber() {
		int primeNumber = 0;
		int[] dizi = randomArray();
		int[] prime = new int[primeNumber];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < i; j++) {
				
				if (i % j != 0) {
					primeNumber++;
					dizi[i] = prime[i];
					break;
				}
				System.out.println("Asal sayılar: " + prime[primeNumber]);
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		tekSayilar();
	} 
}
