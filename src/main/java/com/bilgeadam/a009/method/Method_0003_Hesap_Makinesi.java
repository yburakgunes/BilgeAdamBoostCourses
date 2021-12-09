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
	
	public String scannerVocabulary() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen kelime giriniz ");
		String kelime = klavye.nextLine();
		
		return kelime;
		
	}
	
	public void vowelLetter(String kelime) {
		int count = 0;
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == 'a') {
				count++;
				
			}
		}
		System.out.println("a sayısı: " + count);
	}
	
	public static void functionYusuf() {
		System.out.println("f(x)=ax^2+bx+c fonksiyonunun ve discriminantının hesaplamasına hoşgeldiniz.");
		Scanner klavye = new Scanner(System.in);
		double function = 0.0;
		double a, b, c, x, disc;
		System.out.println("Lütfen a sayısını giriniz ");
		a = klavye.nextDouble();
		System.out.println("Lütfen b sayısını giriniz ");
		b = klavye.nextDouble();
		System.out.println("Lütfen c sayısını giriniz ");
		c = klavye.nextDouble();
		System.out.println("Lütfen x sayısını giriniz ");
		x = klavye.nextDouble();
		function = a * Math.pow(x, x) + b * x + c;
		disc = -Math.pow(b, b) - (4 * a * c);
		System.out.println("Foksiyon: " + function + "Diskriminant: " + disc);
		
	}
	
	public static void discRoot() {
		System.out.println("f(x)=ax^2+bx+c fonksiyonunun köklerinin hesaplanmasına hoşgeldiniz");
		Scanner klavye = new Scanner(System.in);
		double a, b, c, x1, x2, disc;
		System.out.println("Lütfen a sayısını giriniz ");
		a = klavye.nextDouble();
		System.out.println("Lütfen b sayısını giriniz ");
		b = klavye.nextDouble();
		System.out.println("Lütfen c sayısını giriniz ");
		c = klavye.nextDouble();
		disc = -Math.pow(b, b) - (4 * a * c);
		System.out.println("Verilen verilere göre diskriminant: " + disc);
		if (disc > 0) {
			x1 = ((-b + Math.sqrt(disc)) / 2 * a);
			x2 = ((-b - Math.sqrt(disc)) / 2 * a);
			System.out.println("Fonksiyonun kökleri: " + x1 + " & " + x2);
			
		} else if (disc == 0) {
			x1 = x2 = (-b / 2 * a);
			System.out.println("Fonksiyonun kökleri: " + x1 + " & " + x2);
		} else if (disc < 0.0) {
			System.out.println("Sistemin gerçel kökü yoktur.");
		
		}
	}
	
}
