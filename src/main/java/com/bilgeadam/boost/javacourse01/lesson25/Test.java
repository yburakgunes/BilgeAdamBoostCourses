package com.bilgeadam.boost.javacourse01.lesson25;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		// Product pr = new Product();
		// pr.name = "Çivi";
		// pr.price = 12.5;
		// pr.productionDate = "2021-10-08";
		
		HashSet<Product> bucket = new HashSet<>();
		
		Vegetable veg = new Vegetable("Marul", 2.5, "2021-10-01");
		veg.setType("Sebze");
		bucket.add(veg);
		
		MilkProduct mP = new MilkProduct("Süt", 8.0, "2021-12-01");
		mP.setBrandName("Sütaş");
		mP.setDuration(10);
		bucket.add(mP);
		
		MakarnaProduct makarna = new MakarnaProduct("Makarna", 2.5, "2021-12-01");
		makarna.setBrandName("Nuhun Ankara Makarnası");
		makarna.setType("Burgu");
		bucket.add(makarna);
		
		System.out.println(mP.toString());
		System.out.println(makarna);
		System.out.println(veg);
		
		Iterator<Product> iter = bucket.iterator();
		
		for (Product product : bucket) {
			
			System.out.println(product);
			
			if (product instanceof Vegetable) {
				Vegetable vegie = (Vegetable) product;
				vegie.setType("Salatalık");
				System.out.println(vegie);
			}
		}
	}
}
