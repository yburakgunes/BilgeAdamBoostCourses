package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_001_DaireninAlani {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Yar��ap giriniz: ");
		
		int yaricap = klavye.nextInt();
		double alan = ( Math.pow(yaricap, 2) * Math.PI);
		System.out.println("Dairenin alan�: " + alan);
		
		klavye.close();
	}
	
}
