package com.bilgeadam.a009.method;

import java.util.Scanner;

public class Method_0001_kezdongu {
	
	public static void returnNumber() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz: ");
		int number = klavye.nextInt();
		for (int i = 0; i <= number; i++) {
			System.out.print(i + "");
		}
	}
	
	public static void main(String[] args) {
		
		returnNumber();
		
	}
}
