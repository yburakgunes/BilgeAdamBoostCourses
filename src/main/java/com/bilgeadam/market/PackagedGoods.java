package com.bilgeadam.market;

import java.util.Date;

public class PackagedGoods extends Product {
	
	private Date expirationDate;
	
	public PackagedGoods(String EAN, String name, float price, int VATRate, int minStock, Date expirationDate) {
		super(EAN, name, price, VATRate, minStock);
		this.expirationDate = expirationDate;
	}
	
}
