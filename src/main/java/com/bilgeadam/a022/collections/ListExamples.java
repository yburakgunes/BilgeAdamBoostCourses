package com.bilgeadam.a022.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {
	public static void main(String[] args) {
		List<String> iller = new ArrayList<String>();
		iller.add("İstanbul");
		iller.add("Ankara");
		iller.add("İzmir");
		iller.add("Aydın");
		
		// iterative
		System.out.println("1. Döngü iterative for döngüsü ");
		for (int i = 0; i < iller.size(); i++) {
			System.out.print(" " + (i + 1) + ". " + iller.get(i));
		}
		
		System.out.println("\n2.Döngü Özel Döngü---------------------------");
		int count = 0;
		for (String temp : iller) {
			System.out.print(temp + " ");
			count++;
		}
		System.out.println("sayi: " + count);
		System.out.println("\n3.Döngü Özel Döngü---------------------------");
		
		Iterator iterator = iller.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		
		
	}
}
