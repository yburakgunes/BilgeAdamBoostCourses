package com.bilgeadam.a013.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Examples_3 {
	
	public static void arrayNumber() {
		Scanner klavye = new Scanner(System.in);
		String tekSayi;
		char klavyeChar;
		int cevrilmisChar;
		
		while (true) {
			System.out.println("\nLütfen tek bir sayı giriniz: ");
			tekSayi = klavye.nextLine();
			
			// isDigit için String to char
			klavyeChar = tekSayi.charAt(0);
			
			// cast ==> String to int
			cevrilmisChar = Integer.parseInt(tekSayi);
			Random rastgele = new Random();
			
			if ((Character.isDigit(klavyeChar)) && (cevrilmisChar % 2 == 1)) {
				int bas, orta, son;
				
				// kullanıcının tek sayı girdiği yer örneğin :5 elemanlı sayı
				int[] dizi = new int[cevrilmisChar];
				
				for (int i = 0; i < cevrilmisChar; i++) {
					//1 ile kullanıcının girdiği sayıya kadar üst indisi olacak
					int sayi = rastgele.nextInt(cevrilmisChar)+1;
					dizi[i] = sayi;
				}
				
				Arrays.sort(dizi);
				
				//for each
				for (int temp:dizi) {
					System.out.println(temp + " ");
				}
				bas = dizi[0];
				son = dizi [dizi.length-1];
				orta = dizi [(dizi[dizi.length-1]+dizi[0])/2];
				System.out.println("baş: " + bas + " orta: " + orta + " son: " + son);
				int[] value = {bas,orta,son};
				startArray(value);
				
				
				break;
			} else {
				System.out.println("\nSayı girmediniz ve ya Tek sayi girmediniz");
			}
			
		}
		
	}
	
	public static void startArray(int[] value) {
		Scanner klavye = new Scanner (System.in);
		int satir, sutun;
		
		System.out.println("Lütfen satır sayısını giriniz: ");
		satir=klavye.nextInt();
		
		System.out.println("Lütfen sutun sayısını giriniz: ");
		sutun=klavye.nextInt();
		
		int [][] matrix = new int[satir][sutun];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i>j) {
					matrix [i][j] = value [0];
					System.out.print(matrix [i][j] + "  ");
				} else if (i<j) {
					matrix [i][j] = value [2];
					System.out.print(matrix [i][j] + "  ");
				} else if (i == j) {
					matrix [i][j] = value [1];
					System.out.print(matrix [i][j] + "  ");
				}
				System.out.println();
			}
			
		}
		
	}

	public static void main(String[] args) {
		arrayNumber();
		
	}
	
}
