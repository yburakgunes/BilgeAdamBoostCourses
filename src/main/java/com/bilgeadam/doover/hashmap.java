package com.bilgeadam.doover;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "Burak");
		hmap.put(2, "Tuana");
		hmap.put(3, "İlayda");
		hmap.put(4, "Nesrin");
		hmap.put(5, "Yusuf");
		
		
		
		for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
			
			System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
		}
		
		Iterator iterator = hmap.entrySet().iterator();
		while (iterator.hasNext()) {
			
			Map.Entry<Integer, String> forlorn = (Map.Entry<Integer, String>) iterator.next();
			System.out.println(forlorn.getValue() + forlorn.getKey());
			
		}
		
		System.out.println(Arrays.asList(hmap));
		System.out.println(Collections.singletonList(hmap));
		// Key ve value için
		
		for (Object objectName : hmap.keySet()) {
			System.out.println(objectName);
			System.out.println(hmap.get(objectName));
		}
		// Sadece valuelar için
		
		for (Object objectName : hmap.values()) {
			System.out.println(objectName);
		}
	}
}
