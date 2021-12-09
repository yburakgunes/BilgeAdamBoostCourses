package com.bilgeadam.boost.javacourse01.lesson25;

import java.util.HashSet;

public class Market {
	private HashSet<Product> products;
	
	public Market() {
		products = new HashSet<>();
		
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void listProducts() {
		for (Product product : products) {
			System.out.println(product.toString());
		}
	}
	
	public void listSpoiledProducts() {
		for (Product product : products) {
			
			if (product instanceof Vegetable) {
				Vegetable vegie = (Vegetable) product;
				if (vegie.isSpoiled()) {
					System.out.println(vegie);
				}
			} else if (product instanceof MilkProduct) {
				MilkProduct milky = (MilkProduct) product;
				if (milky.isSpoiled()) {
					System.out.println(milky);
				}
			}
		}
	}
}
