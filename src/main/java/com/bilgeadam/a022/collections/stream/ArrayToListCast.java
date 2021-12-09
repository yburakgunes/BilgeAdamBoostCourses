package com.bilgeadam.a022.collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListCast {
	// Array'i List'e çevirdi.
	public static void main(String[] args) {
		System.out.println("Array'i Liste çevirdim");
		String[] dizi = { "Malatya", "Sivas", "Edirne", "Maraş" };
		// List<String> list = arrayToList(dizi);
		List<String> list = Arrays.asList(dizi);
		
		for (String abc : list) {
			System.out.println(abc);
		}
		
		System.out.println("ABC");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n*************************");
		System.out.println("List'i Array'e çevirdim");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Malatya");
		list2.add("Sivas");
		list2.add("Edirne");
		list2.add("Maraş");
		
		// String[] dizi2 = listToArray(list2);
		
		String[] dizi2 = new String[list2.size()];
		list2.toArray(dizi2);
		
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println(dizi2[i]);
		}
		System.out.println("FOREACH BABY");
		for (String temp : dizi2) {
			System.out.println(temp + " ");
		}
		
	}
	
	// private static String[] listToArray(List<String> list2) {
	// String[] inArray = new String[list2.size()];
	//
	// return list2.toArray(inArray);
	// }
	
	// List'i Array'e çevirmek
	
	private static List<String> arrayToList(String[] dizi) {
		return Arrays.asList(dizi);
		
	}
	
}
