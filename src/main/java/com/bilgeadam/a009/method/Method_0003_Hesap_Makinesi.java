package com.bilgeadam.a009.method;

import java.util.Scanner;

public class Method_0003_Hesap_Makinesi {
	
	public void hesapMakinasi(int sayi1, int sayi2) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("L�tfen 1. say�y� giriniz: ");
		sayi1 = klavye.nextInt();
		System.out.println("L�tfen 2. say�y� giriniz: ");
		sayi2 = klavye.nextInt();
		
		System.out.println("Toplama sonucu: " + (sayi1 + sayi2));
		
		System.out.println("��karma sonucu: " + (sayi1 - sayi2));
		
		System.out.println("�arpma sonucu: " + (sayi1 * sayi2));
		
		System.out.println("B�lme sonucu: " + (sayi1 / sayi2));
		
		System.out.println("Kalan sonucu: " + (sayi1 % sayi2));
		
	}
	
	// �sl� say�
	public void usluSayi() {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;
		System.out.println("L�tfen alt giriniz: ");
		sayi1 = klavye.nextInt();
		System.out.println("L�tfen �st giriniz: ");
		sayi2 = klavye.nextInt();
		System.out.println(Math.pow(sayi1, sayi2));
		
	}
	
	public void karekokSayi() {
		Scanner klavye = new Scanner(System.in);
		double sayi1;
		System.out.println("L�tfen alt giriniz: ");
		sayi1 = klavye.nextInt();
		System.out.println(Math.sqrt(sayi1));
		
	}
	
	public int sayi1() {
		Scanner klavye = new Scanner(System.in);
		int sayi1;
		System.out.println("L�tfen alt giriniz: ");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	public int sayi2() {
		Scanner klavye = new Scanner(System.in);
		int sayi2;
		System.out.println("L�tfen alt giriniz: ");
		sayi2 = klavye.nextInt();
		return sayi2;
	}
	
	public void buyuk() {
		
		int sayi1 = sayi1();
		
		int sayi2 = sayi2();
		
		if (sayi1 > sayi2) {
			System.out.println(sayi1 + " büyüktür");
		} else {
			System.out.println(sayi1 + " küçüktür");
		}
		
	}
	
	public void kucuk() {
		int sayi1 = sayi1();
		
		int sayi2 = sayi2();
		
		if (sayi1 < sayi2) {
			System.out.println(sayi1 + " küçüktür");
		} else {
			System.out.println(sayi1 + " büyüktür");
		}
	}
	
	public void tekCift() {
		int sayi1 = sayi1();
		if (sayi1 % 2 == 0) {
			System.out.println("Çift sayıdır");
		} else {
			System.out.println("Sayı tektir");
		}
	}
	
	public static String kelimeIste(String kelime) {
		System.out.println("Lütfen kelime giriniz ");
		Scanner scan = new Scanner(System.in);
		System.out.println("kelimeniz: " + scan);
		scan.close();
		return kelime;
		
	}
	
}
