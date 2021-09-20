package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_005_VizeFinal {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		while(true) {
		System.out.print("Vize notunu giriniz: ");
		double vizeNotu = klavye.nextDouble();
		System.out.print("Final notunu giriniz: ");
		double finalNotu = klavye.nextDouble();
		double ortalama = vizeNotu * 0.4 + finalNotu * 0.6;
		
		if(vizeNotu<0 || finalNotu<0) {
			System.out.println("L�tfen s�f�dan k���k say� girmeyiniz.");
				
		}else {
		
		if ((50 <= ortalama) && (ortalama < 60)) {
			System.out.println("Ortalaman�z: " + ortalama + "Ge�me Notunuz: DC");
		} else if ((60 <= ortalama) && (ortalama < 70)) {
			System.out.println("Ortalaman�z: " + ortalama + "Ge�me Notunuz: CC");
		} else if ((70 <= ortalama) && (ortalama < 80)) {
			System.out.println("Ortalaman�z: " + ortalama + "Ge�me Notunuz: BA");
		} else if ((80 <= ortalama) && (ortalama < 100)) {
			System.out.println("Ortalaman�z: " + ortalama + "Ge�me Notunuz: AA");
		} else {
			System.out.println("L�tfen belirtilen aral�kta say� giriniz.");
		}
		klavye.close();
	}
	}
}
}