package com.bilgeadam.a022.collections.stream;

import java.util.Arrays;

public class WhatIsStream {
	// Stream () Alıştır
	// kodlarımızı daha az yazmak çok uğraşmamaktır
	// IO ile karıştırılmamalıdır.
	
	public static void iterativeArray() {
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Maraş" };
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i] + " ");
		}
	}
	
	public static void streamArray() {
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Maraş" };
		Arrays.asList(dizi).stream().forEach(System.out::print);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Iterative For");
		iterativeArray();
		
		System.out.println("\n*****************************");
		System.out.println("Stream for");
		streamArray();
	}
}