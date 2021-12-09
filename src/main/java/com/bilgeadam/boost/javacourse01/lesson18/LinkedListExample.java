package com.bilgeadam.boost.javacourse01.lesson18;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.add(1);
		linkedList.add(1.4);
		linkedList.add("Bilge");
		linkedList.add(true);
		
		MyObject myObject = new MyObject();
		myObject.name = "Burak";
		myObject.type = "İnsan";
		myObject.power = 12;
		linkedList.add(myObject);
		
		MyObject myObject2 = new MyObject();
		myObject2.name = "Güneş";
		myObject2.type = "Köpek";
		myObject2.power = 32;
		linkedList.add(myObject2);
		
//		for (Iterator iterator = linkedList.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//			System.out.println(object);
//			MyObject obj = (MyObject) object;
//			System.out.println(obj.name);
		}
		
	}		
	

	

