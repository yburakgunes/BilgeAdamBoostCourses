package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_003_Hipotenus {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		int sayi1, sayi2, sonuc;
	
		System.out.print("L�tfen 1. say�y� giriniz: ");
		sayi1 = Math.abs(klavye.nextInt());
		System.out.print("L�tfen 2. say�y� giriniz: ");
		sayi2 = Math.abs(klavye.nextInt());
		sonuc = (int) Math.sqrt(((int) Math.pow(sayi1, 2)) + ((int) Math.pow(sayi2, 2)));
		System.out.println(sayi1+" "+sayi2+" "+" Hipoten�s: " + sonuc);
		klavye.close();
		
	}
	
}
