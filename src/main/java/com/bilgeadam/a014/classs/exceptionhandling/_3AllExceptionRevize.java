package com.bilgeadam.a014.classs.exceptionhandling;

public class _3AllExceptionRevize {
	public static void deneme() {
		// 0 1 2 3 4
		int[] dizi = new int[5];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = i;
		}
		
		// forEach
		for (int temp : dizi) {
			System.out.print(dizi[temp] + " ");
		}
		System.out.println("");
		try {
			System.out.println(dizi[5]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program devam ediyor 2222 ");
	}
	
	public static void main(String[] args) {
		deneme();
	}
	
}