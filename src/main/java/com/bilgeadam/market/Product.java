package com.bilgeadam.market;

public class Product {
	private String EAN;
	private String name;
	private float price;
	private int VATRate;
	private int currentStock;
	private int minStock;
	
	public Product(String EAN, String name, float price, int VATRate, int minStock) {
		super();
		this.EAN = EAN;
		this.name = name;
		this.price = price;
		this.VATRate = VATRate;
		this.minStock = minStock;
		this.currentStock = 0;
	}
	
	public Product(String EAN, String name, float price, int VATRate, int minStock, int currentStock) {
		super();
		this.EAN = EAN;
		this.name = name;
		this.price = price;
		this.VATRate = VATRate;
		this.minStock = minStock;
		this.currentStock = currentStock;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getVATRate() {
		return VATRate;
	}
	
	public void setVATRate(int vATRate) {
		VATRate = vATRate;
	}
	
	public int getCurrentStock() {
		return currentStock;
	}
	
	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}
	
	public int getMinStock() {
		return minStock;
	}
	
	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}
	
	public String getEAN() {
		return EAN;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Product [getPrice()=" + getPrice() + ", getVATRate()=" + getVATRate() + ", getCurrentStock()="
				+ getCurrentStock() + ", getMinStock()=" + getMinStock() + ", getEAN()=" + getEAN() + ", getName()="
				+ getName() + "]";
	}
	
}
