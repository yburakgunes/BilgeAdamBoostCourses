package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_010_Password_RePassword {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		final String password;
		final String rePassword;
		
		System.out.println("L�tfen �ifrenizi giriniz: ");
		password = klavye.nextLine();
		
		System.out.println("L�tfen �ifrenizi yeniden giriniz: ");
		rePassword = klavye.nextLine();
		
		if (password.equals(rePassword)) {
			System.out.println("�ifreler ayn�d�r");
		} else {
			System.out.println("�ifreler ayn� de�il!");
		}
		
	}
	
}
