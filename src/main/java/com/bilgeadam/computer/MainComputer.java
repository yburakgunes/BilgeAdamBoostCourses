package com.bilgeadam.computer;

import com.bilgeadam.computer.mamcart1.Maincart1;

public class MainComputer {
	
	public static void main(String[] args) {
		Maincart1 maincart1 = new Maincart1();
		maincart1.setModel("Msi");
		maincart1.setPrice("123124TL");
		maincart1.setYear("2005");
		maincart1.getModel();
		maincart1.getPrice();
		maincart1.getYear();
		System.out.println(maincart1);
		
	}
	
}
