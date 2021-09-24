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
			System.out.println("\nLütfen Kullanýcý email giriniz");
			userEmail = klavye.nextLine().trim();
			System.out.println("\nLütfen Kullanýcý þifrenizi giriniz");
			userPassword = klavye.nextLine().trim();
			
			for (int i = 0; i < userPassword.length(); i++) {
				maskString = maskString + "*";
				System.out.println("Maskelenmiþ þifre: " + maskString);
				
				if ((userEmail.equals(dbEmail)) && (userPassword.equals(dbPassword))) {
					System.out.println("Admin sayfasýna yönlendiriliyorsunuz");
					System.out.println(
							"Toplama için 1, Çýkarma için 2, Bölme için 3, Çarpma için 4, Üslü sayý için 5'e...");
					while (true) {
						int input = klavye.nextInt();
						switch (input) {
							case 1:
								System.out.println("Lütfen 1. sayýyý giriniz: ");
								int sayi1 = klavye.nextInt();
								System.out.println("Lütfen 2. sayýyý giriniz: ");
								int sayi2 = klavye.nextInt();
								System.out.println("Toplama iþleminin sonucu: " + (sayi1 + sayi2));
								break;
							case 2:
								System.out.println("Lütfen 1. sayýyý giriniz: ");
								int sayi3 = klavye.nextInt();
								System.out.println("Lütfen 2. sayýyý giriniz: ");
								int sayi4 = klavye.nextInt();
								System.out.println("Çýkarma iþleminin sonucu: " + (sayi3 + sayi4));
								break;
							case 3:
								System.out.println("Lütfen 1. sayýyý giriniz: ");
								int sayi5 = klavye.nextInt();
								System.out.println("Lütfen 2. sayýyý giriniz: ");
								int sayi6 = klavye.nextInt();
								System.out.println("Bölme iþleminin sonucu: " + (sayi5 + sayi6));
								break;
							case 4:
								System.out.println("Lütfen 1. sayýyý giriniz: ");
								int sayi7 = klavye.nextInt();
								System.out.println("Lütfen 2. sayýyý giriniz: ");
								int sayi8 = klavye.nextInt();
								System.out.println("Çarpma iþleminin sonucu: " + (sayi7 + sayi8));
								break;
							case 5:
								System.out.println("Lütfen 1. sayýyý giriniz: ");
								int sayi9 = klavye.nextInt();
								System.out.println("Lütfen 2. sayýyý giriniz: ");
								int sayi10 = klavye.nextInt();
								System.out.println("Üslü Sayý iþleminin sonucu: " + (Math.pow(sayi9, sayi10)));
								break;
							case 6:
								System.out.println("Lütfen kelime giriniz: ");
								String kelime1 = klavye.next();
								for (int j = kelime1.length(); j >= 0; j--) {
									System.out.print(kelime1.charAt(j - 1));
									//reverseKelime1=reverseKelime1 + kelime1.charAt(i);
									//reverseKelime1+=value.charAt(i);
									
								}
								break;
							case 7:
								System.out.println("Lütfen kelime giriniz: ");
								String kelime2 = klavye.next();
								int sayac = 0;
								for (int k = 0; k < kelime2.length(); k++) {
									if (Character.isLetter(kelime2.charAt(k)))
										sayac++;
									System.out.println(sayac);
								}
								break;
							case 8:
								System.out.println("Lütfen kelime giriniz: ");
								String kelime3 = klavye.next();
								System.out.println("Yeni kelimeniz: " + kelime3.replace('þ', 's'));
								
								break;
							case 0:
								System.exit(0);
								
							default:
								System.out.println("Lütfen belirtilen aralýkta sayý giriniz!");
								
						}
						
						break;
						
					}
				} else {
					System.out.println("Email ve ya þifre yanlýþ girdiniz");
					System.out.println("kalan hakkýnýz: " + (attempt - 1));
					
					if (attempt == 1) {
						System.out.println(
								"4 kere yanlýþ giriþ yapýldý. Hesabýnýz bloke oldu. Lütfen müþteri hizmetleri ile iletiþime geçiniz +09 444 55 99 66");
						System.exit(0);
						break;
					}
					attempt--;
				}
			}
		}
	}
}