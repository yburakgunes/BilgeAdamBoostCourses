package com.bilgeadam.a007.string;

import java.util.Scanner;

public class StringLesson2Login {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen mail adresinizi giriniz:");
		String dbemail = klavye.nextLine();
			while (true)
				if (!dbemail.trim().contains("root@com")) {
					System.out.println("Email adresinizi yeniden giriniz!");
					break;
				} else {
					System.out.println("Email adresiniz doðru");
					
					{
						System.out.println("Lütfen þifrenizi giriniz:");
						String dbpassword = klavye.nextLine();
						System.out.println(dbpassword.replace(dbpassword, "****"));
						if (dbpassword.trim().contains("root")) {
							System.out.println("Girme iþlemi baþarýlý!");
						} else {
							int i;
							for (i = 0; i < 3; i++)
								System.out.println("Yanlýþ bir þifre girdiniz yeniden deneyin!");
							if (i == 3)
								;
							System.out.println(
									"Deneme hakkýnýz doldu lütfen müþteri hizmetlerini arayýn +90 444 555 96 22");
							break;
						}
					}
				}
		}
	}