package com.bilgeadam.a014.classexamples;

import java.util.Scanner;

public class LoginMethod {
	private static Scanner scan = new Scanner(System.in);
	
	public static void loginMethodOrnegi() {
		
		System.out.println("Lütfen adınızı giriniz: ");
		String name = scan.nextLine();
		
		System.out.println("Lütfen soyadınızı giriniz: ");
		String lastName = scan.nextLine();
		
		System.out.println("Lütfen emailinizi giriniz: ");
		String email = scan.nextLine();
		
		System.out.println("Lütfen telefonunuzu giriniz: ");
		String num = scan.nextLine();
		
		System.out.println(" adınız: "
				+ name + " soyadınız: " + lastName + " emailiniz:  " + email + " Numaranız:  "
				+ num + "\n ");
		
	}
}
