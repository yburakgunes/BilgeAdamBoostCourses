package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_010_Password_RePassword {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		final String password;
		final String rePassword;
		
		System.out.println("Lütfen þifrenizi giriniz: ");
		password = klavye.nextLine();
		
		System.out.println("Lütfen þifrenizi yeniden giriniz: ");
		rePassword = klavye.nextLine();
		
		if (password.equals(rePassword)) {
			System.out.println("Þifreler aynýdýr");
		} else {
			System.out.println("Þifreler ayný deðil!");
		}
		
	}
	
}
