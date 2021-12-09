package com.bilgeadam.a013.arrays;

import java.util.Scanner;

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

public class Array_Examples_2 {
	
	public static void starArray() {
		Scanner klavye = new Scanner(System.in);
		String simge;
		int rows, cols;
		String[][] matrix;
		
		System.out.println("Lütfen bir Satır giriniz: ");
		rows = klavye.nextInt();
		
		System.out.println("Lütfen bir sütun giriniz: ");
		cols = klavye.nextInt();
		klavye.nextLine();
		
		System.out.println("Lütfen bir simge giriniz: ");
		simge = klavye.nextLine();
		
		matrix = new String[rows][cols];
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix [i][j] = simge;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		starArray();
	}
}
