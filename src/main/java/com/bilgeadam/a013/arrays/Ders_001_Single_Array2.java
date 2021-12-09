package com.bilgeadam.a013.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ders_001_Single_Array2 {
	
	public static void main(String[] args) {
		
		// ÖDEV
		// kullanıcı tarafından satır ve sütun girilecek
		// kullanıcıdan bir simge alacağız ve simgeyi ekranda gösterecek
		//
		
		int satir, sutun;
		String simge;
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lütfen bir simge giriniz: ");
		simge = klavye.nextLine();
		
		System.out.println("Lütfen satır sayısını giriniz: ");
		satir = klavye.nextInt();
		
		System.out.println("Lütfen sütun sayısını giriniz: ");
		sutun = klavye.nextInt();
		
		int[][] matrix = new int[satir][sutun];
		String [][] matrix2 = new String [satir][sutun];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
				matrix2 [i][j] = simge; 
				
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		// ÖDEV
		// kullanıcı tarafından satır ve sütun girilecek
		// random olarak Tek elemanlı sayı girilsin
		// 1 2 3 4 5
		// ortasındaki sayı : diagonal
		// sayılardan büyük olan üste gelecek
		// sayıların küçük olan alta gelecek
		
		// 0 1 1 1
		// 2 0 1 1
		// 2 2 0 1
		// 2 2 2 0
		
	}

	private static String parseInt(String simge) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
