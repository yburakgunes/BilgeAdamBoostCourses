package com.bilgeadam.market;

public class Cereals extends PackedUnpackedProduct implements Wholesalable{
	
	private int shelfLife; //kaç gün taze kalıyor

	public Cereals(String EAN, String name, float price, int VATRate, int minStock, boolean packed) {
		super(EAN, name, price, VATRate, minStock, packed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateDiscountPrice() {
		
		return 0;
	}
	
	
	
}
