package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_002_Evenorodd {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		while(true) {
			System.out.println("L�tfen bir say� giriniz");
		int sayi = klavye.nextInt();
		if (sayi==-1) {
			System.out.println("Sistemden ��k�� sa�lan�yor ...");
			System.exit(0);
		} else {
		
		if (sayi >= 0) {
			if (sayi % 2 == 0) {
				System.out.println("�ift Say�d�r");
			} else {
				System.out.println("Tek Say�d�r");
			}
		} else {
			System.out.println("Negatif say� girdiniz. L�tfen pozitif say� giriniz. ");
		}
		
		}
		klavye.close();
		}
	}
}