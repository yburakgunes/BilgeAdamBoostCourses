package com.bilgeadam.boost.javacourse01.lesson15;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class InvoiceTest {
	
	public static void main(String[] args) {
		Invoice inv1 = new Invoice();
		Invoice inv2 = new Invoice();
		Invoice inv3 = new Invoice();
		
		inv1.name = BAUtils.readString("Lüfen mekan adını giriniz");
		inv1.netValue = BAUtils.readDouble("Lütfen meblayı giriniz");
		int vat=BAUtils.readInt("Lütfen KDV oranını giriniz");
		inv1.calcVAT(vat);
		System.out.println(inv1.taxedValue);
		
		inv1.name = "Kırtasiye";
		inv2.netValue = 160.0d;
		inv2.calcVAT(8);
		System.out.println(inv2.taxedValue);
		
		inv3.name = "Market";
		inv3.netValue = 250.0d;
		inv3.calcVAT(15);
		System.out.println(inv3.taxedValue);
	}
	
}
