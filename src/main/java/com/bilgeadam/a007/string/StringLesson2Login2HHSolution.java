package com.bilgeadam.a007.string;

import java.util.Scanner;

public class StringLesson2Login2HHSolution {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		String dbPassword = "root";
		String dbEmail = "root@com";
		String userEmail = "", userPassword = "", maskString = "";
		int attempt = 4;
		
		while (attempt >= -1) {
			System.out.println("\nL�tfen Kullan�c� email giriniz");
			userEmail = klavye.nextLine().trim();
			System.out.println("\nL�tfen Kullan�c� �ifrenizi giriniz");
			userPassword = klavye.nextLine().trim();
			
			for (int i = 0; i < userPassword.length(); i++) {
				maskString = maskString + "*";
				System.out.println("Maskelenmi� �ifre: " + maskString);
				
				if ((userEmail.equals(dbEmail)) && (userPassword.equals(dbPassword))) {
					System.out.println("Admin sayfas�na y�nlendiriliyorsunuz");
					System.out.println(
							"Toplama i�in 1, ��karma i�in 2, B�lme i�in 3, �arpma i�in 4, �sl� say� i�in 5'e...");
					while (true) {
						int input = klavye.nextInt();
						switch (input) {
							case 1:
								System.out.println("L�tfen 1. say�y� giriniz: ");
								int sayi1 = klavye.nextInt();
								System.out.println("L�tfen 2. say�y� giriniz: ");
								int sayi2 = klavye.nextInt();
								System.out.println("Toplama i�leminin sonucu: " + (sayi1 + sayi2));
								break;
							case 2:
								System.out.println("L�tfen 1. say�y� giriniz: ");
								int sayi3 = klavye.nextInt();
								System.out.println("L�tfen 2. say�y� giriniz: ");
								int sayi4 = klavye.nextInt();
								System.out.println("��karma i�leminin sonucu: " + (sayi3 + sayi4));
								break;
							case 3:
								System.out.println("L�tfen 1. say�y� giriniz: ");
								int sayi5 = klavye.nextInt();
								System.out.println("L�tfen 2. say�y� giriniz: ");
								int sayi6 = klavye.nextInt();
								System.out.println("B�lme i�leminin sonucu: " + (sayi5 + sayi6));
								break;
							case 4:
								System.out.println("L�tfen 1. say�y� giriniz: ");
								int sayi7 = klavye.nextInt();
								System.out.println("L�tfen 2. say�y� giriniz: ");
								int sayi8 = klavye.nextInt();
								System.out.println("�arpma i�leminin sonucu: " + (sayi7 + sayi8));
								break;
							case 5:
								System.out.println("L�tfen 1. say�y� giriniz: ");
								int sayi9 = klavye.nextInt();
								System.out.println("L�tfen 2. say�y� giriniz: ");
								int sayi10 = klavye.nextInt();
								System.out.println("�sl� Say� i�leminin sonucu: " + (Math.pow(sayi9, sayi10)));
								break;
							case 6:
								System.out.println("L�tfen kelime giriniz: ");
								String kelime1 = klavye.next();
								for (int j = kelime1.length(); j >= 0; j--) {
									System.out.print(kelime1.charAt(j - 1));
									//reverseKelime1=reverseKelime1 + kelime1.charAt(i);
									//reverseKelime1+=value.charAt(i);
									
								}
								break;
							case 7:
								System.out.println("L�tfen kelime giriniz: ");
								String kelime2 = klavye.next();
								int sayac = 0;
								for (int k = 0; k < kelime2.length(); k++) {
									if (Character.isLetter(kelime2.charAt(k)))
										sayac++;
									System.out.println(sayac);
								}
								break;
							case 8:
								System.out.println("L�tfen kelime giriniz: ");
								String kelime3 = klavye.next();
								System.out.println("Yeni kelimeniz: " + kelime3.replace('�', 's'));
								
								break;
							case 0:
								System.exit(0);
								
							default:
								System.out.println("L�tfen belirtilen aral�kta say� giriniz!");
								
						}
						
						break;
						
					}
				} else {
					System.out.println("Email ve ya �ifre yanl�� girdiniz");
					System.out.println("kalan hakk�n�z: " + (attempt - 1));
					
					if (attempt == 1) {
						System.out.println(
								"4 kere yanl�� giri� yap�ld�. Hesab�n�z bloke oldu. L�tfen m��teri hizmetleri ile ileti�ime ge�iniz +09 444 55 99 66");
						System.exit(0);
						break;
					}
					attempt--;
				}
			}
		}
	}
}