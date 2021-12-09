package com.bilgeadam.doover;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayyyList {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(15);
		alist.add(23);
		alist.add(11);
		alist.add(14);
		alist.add(8);
		alist.add(9);
		
		System.out.println("For Loop");
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		
		System.out.println("For each");
		for (Integer list2 : alist) {
			System.out.println(list2);
			
		}
		
		System.out.println("Iterator");
		Iterator iter = alist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("While döngüsü");
		int ad = 0;
		while (alist.size() > ad) {
			System.out.println(alist.get(ad));
			ad++;
		}
		
		System.out.println("Enumeration");
		Enumeration<Integer> e = Collections.enumeration(alist);
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
	}
}
