package com.bilgeadam.boost.javacourse01.lesson25;

public class MarketTest {
	public static void main(String[] args) {
		Market bakkal = new Market();
		
		Vegetable veg = new Vegetable("Marul", 2.5, "2021-10-01");
		veg.setType("Sebze");
		bakkal.addProduct(veg);
		bakkal.addProduct(new Vegetable("Salatalık", 2.5,"2020-12-01"));
		
		MilkProduct mP = new MilkProduct("Süt", 8.0, "2021-12-01");
		mP.setBrandName("Sütaş");
		mP.setDuration(10);
		bakkal.addProduct(mP);
		
		MakarnaProduct makarna = new MakarnaProduct("Makarna", 2.5, "2021-12-01");
		makarna.setBrandName("Nuhun Ankara Makarnası");
		makarna.setType("Burgu");
		bakkal.addProduct(makarna);
		
		makarna.buy(10);
		makarna.sell(5);
		
		veg.buy(20);
		
		bakkal.addProduct(new MakarnaProduct("Peynir", 45, "2021-10-08"));
		bakkal.listProducts();
		
	}
}
