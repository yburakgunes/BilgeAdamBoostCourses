package com.bilgeadam.boost.javacourse01.lesson18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class LinkedVsArrayList {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		ArrayList arrayList = new ArrayList();
		
		Random rnd = new Random();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(rnd.nextInt());
			
		}
		long stop = System.currentTimeMillis();
		System.out.println("Inserting 1.000.000 element to ArrayList took: " + (stop - start));
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(rnd.nextInt());
		}
		stop = System.currentTimeMillis();
		System.out.println("Inserting 1.000.000 element to LinkedList took: " + (stop - start));
		
		int input = BAUtils.readInt("Bir sayı");
		arrayList.add(input);
		
		System.out.println(arrayList.get(1000000));
		System.out.println(linkedList.size());
		
	}
	
}