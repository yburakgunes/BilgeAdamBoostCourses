package com.bilgeadam.a022.collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_forEach {
	public static void main(String[] args) {
		String[] dizi = { "Adana", "Nevşehir", "İstanbul", "Muş" };
		// Diziyi Liste çevirdik
		List<String> listem_0 = Arrays.asList(dizi);
		/////////////////////////////////////////////////////
		List<String> listem = Arrays.asList("Adana", "Nevşehir", "İstanbul", "Muş");
		////////////////////////////////////////////////////
		List<String> listem2 = new ArrayList<String>();
		listem2.add("Adana");
		listem2.add("Nevşehir");
		listem2.add("İstanbul");
		listem2.add("Muş");
		listem2.stream().forEach(System.out::print);
		System.out.println("\n//////////////////");
		listem2.forEach(System.out::print);
		
	}
}
