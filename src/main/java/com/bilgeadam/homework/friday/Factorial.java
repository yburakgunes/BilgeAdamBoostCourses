package com.bilgeadam.homework.friday;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		boolean isResult = true;
		while (isResult) {
			
			System.out.println("Lütfen bir sayý giriniz: ");
			int sayi = klavye.nextInt();
			long fact = 1;
			if (sayi < 0) {
				;
				System.out.println("Lütfen pozitif bir sayý giriniz! ");
			}
			if (sayi == 0) {
				;
				fact = 1;
				System.out.println("Girilen sayýnýn faktoriyeli: " + fact);
			} else {
				for (int i = 1; i <= sayi; i++) {
					fact = fact * i;
				}
				System.out.println("Girilen sayýnýn faktoriyeli: " + fact);
				
			}
		}
		klavye.close();
	}
}