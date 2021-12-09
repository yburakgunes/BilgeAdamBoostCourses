package com.bilgeadam.a013.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Examples_4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 23;
		arr1[2] = 43;
		arr1[3] = 78;
		arr1[4] = 1;
		
		System.out.println("Doğrudan erişim: " + arr1[3]);
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Sırayla eski model erişim: " + arr1[i]);
		}
		
		for (int content : arr1) {
			System.out.println("Sırayla yeni model erişim: " + content);
		}
		for (int i = arr1.length - 1; i >= 0; i--) {
			System.out.println("Sırayla eski model tersten erişim: " + arr1[i]);
			
		}
		
		int[] arr2 = { 5, 25, 56, 64 };
		
		int[] arr3 = new int[5];
		for (int i = 0; i < arr3.length; i++) {
			System.out.print("Bir tam sayı değer giriniz: ");
			arr3[i] = scan.nextInt();
		}
		System.out.println();
		for (int content : arr3) {
			System.out.println(content);
		}
		
		Arrays.fill(arr2, 55);
		System.out.println();
		for (int content : arr2) {
			System.out.println(content);
		}
		
		int[][] twoDimensional = new int[2][3];
		Random rnd = new Random();
		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < 3; y++) {
				twoDimensional[x][y] = rnd.nextInt(10);
				// for (int z = 0; z < 4; z++) {
				// threeDimensional [x][y][z] =rnd.nextInt(10);
				// }
			}
		}
		for (int[] innerArray : twoDimensional) {
			for (int content : innerArray) {
				System.out.print(content + "   ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(twoDimensional[i][j] + " ");
			}
			
		}
	}
}