package com.bilgeadam.market;

public class PackedUnpackedProduct extends Product {
	
	private boolean packed;
	private String origin;
	private float volume;
	private Unit unit;
	
	public PackedUnpackedProduct(String EAN, String name, float price, int VATRate, int minStock, boolean packed) {
		super(EAN, name, price, VATRate, minStock);
		this.packed = packed;
	}
	
}
