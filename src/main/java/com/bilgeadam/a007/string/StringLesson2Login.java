package com.bilgeadam.a007.string;

import java.util.Scanner;

public class StringLesson2Login {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("L�tfen mail adresinizi giriniz:");
		String dbemail = klavye.nextLine();
			while (true)
				if (!dbemail.trim().contains("root@com")) {
					System.out.println("Email adresinizi yeniden giriniz!");
					break;
				} else {
					System.out.println("Email adresiniz do�ru");
					
					{
						System.out.println("L�tfen �ifrenizi giriniz:");
						String dbpassword = klavye.nextLine();
						System.out.println(dbpassword.replace(dbpassword, "****"));
						if (dbpassword.trim().contains("root")) {
							System.out.println("Girme i�lemi ba�ar�l�!");
						} else {
							int i;
							for (i = 0; i < 3; i++)
								System.out.println("Yanl�� bir �ifre girdiniz yeniden deneyin!");
							if (i == 3)
								;
							System.out.println(
									"Deneme hakk�n�z doldu l�tfen m��teri hizmetlerini aray�n +90 444 555 96 22");
							break;
						}
					}
				}
		}
	}