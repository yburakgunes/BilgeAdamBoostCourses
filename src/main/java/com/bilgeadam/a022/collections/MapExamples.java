package com.bilgeadam.a022.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// List : Arraylist
// Map : HashMap

public class MapExamples {
	
	public static void main(String[] args) {
		// HHLT
		// K = Key yani unique yani benzersiz olması gerekiyor. (Sıra numarası)
		// V = Value yani değer
		
		Map<String, Object> mapList = new HashMap<String, Object>();
		mapList.put("1", "Aydın");
		mapList.put("2", "İstanbul");
		mapList.put("3", "Ankara");
		mapList.put("4", "İzmir");
		mapList.put("4", "Adıyaman");
		
		System.out.println(mapList.get("1"));
		
		// key
		for (String temp : mapList.keySet()) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// value
		for (Object temp : mapList.values()) {
			System.out.print(temp + " ");
		}
		System.out.println();
		// M.e.g.l.es(melez)
		for (Map.Entry<String, Object> temp : mapList.entrySet()) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// set=benzersiz elemanlar (Aynı elemanları almaz)
		Set set = mapList.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " " + mapList.get(iterator.next()) + " ");
		}
		System.out.println();
		// map döngüsü
		mapList.entrySet().forEach(System.out::print);
		
	}
	
}
