package com.bilgeadam.homework.friday;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		boolean isResult = true;
		while (isResult) {
			
			System.out.println("L�tfen bir say� giriniz: ");
			int sayi = klavye.nextInt();
			long fact = 1;
			if (sayi < 0) {
				;
				System.out.println("L�tfen pozitif bir say� giriniz! ");
			}
			if (sayi == 0) {
				;
				fact = 1;
				System.out.println("Girilen say�n�n faktoriyeli: " + fact);
			} else {
				for (int i = 1; i <= sayi; i++) {
					fact = fact * i;
				}
				System.out.println("Girilen say�n�n faktoriyeli: " + fact);
				
			}
		}
		klavye.close();
	}
}