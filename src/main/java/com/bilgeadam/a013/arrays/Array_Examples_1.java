package com.bilgeadam.a013.arrays;

import java.util.Scanner;

public class Array_Examples_1 {
	
	public static void main(String[] args) {
//		// 1 2 3 4 5 
//		// (son terim + ilk terim) / 2
//		Scanner klavye = new Scanner(System.in);
//		System.out.println("Lütfen bir sayı giriniz: ");
//		int sayi1=klavye.nextInt();
//		
//		int[] dizi = new int[sayi1];
//		int[] dizi2 = new int[sayi1];
//		for (int i = 0; i < sayi1-1; i++) {
//			dizi[i] = dizi2[2];
//			System.out.println(dizi2[sayi1-1]);
//		}
		
		//double değerlerimiz nokta koymamız gerekiyor.
		int[]array = {1,2,3,4,5};
		double middleElement = Math.ceil(array.length/2.0);
		System.out.println(middleElement);
		
		
		
	}
	
}
