package com.bilgeadam.boost.javacourse01.lesson18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListContentManagement {
	
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList(75);
		
		Random rnd = new Random();
		
		for (int i = 0; i < 100; i++) {
			arrayList.add(rnd.nextInt(150));
		}
		
//		System.out.println(arrayList.get(63));
//		arrayList.set(63, "uyıyıu");
//		System.out.println(arrayList.get(63));
//		
//		System.out.println(arrayList.get(64));
//		arrayList.remove(63);
//		System.out.println(arrayList.get(63));
		
			for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
//			
//		}
//		for (Object object : arrayList) {
//			System.out.println(object);
//		}
//		System.out.println();
//		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
//			System.out.println(iterator.next());
		}
		
	}
	
}
