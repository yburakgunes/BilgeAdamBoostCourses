package com.bilgeadam.boost.javacourse01.lesson25;

public abstract class Product {
	static final int MAX_DURATION = 20;
	private String name;
	private double price;
	private String productionDate;
	private int numberOfProduct;
	
	public Product(String name, double price, String productionDate) {
		super();
		this.name = name;
		this.price = price;
		this.productionDate = productionDate;
		this.numberOfProduct = 0;
	}
	
	public abstract void buy(int number);
	
	public abstract void sell(int number);
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", productionDate=" + productionDate
				+ ", numberOfProduct=" + numberOfProduct + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getProductionDate() {
		return productionDate;
	}
	
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	
	public int getNumberOfProduct() {
		return numberOfProduct;
	}
	
	public void setNumberOfProduct(int numberOfProduct) {
		this.numberOfProduct = numberOfProduct;
	}
	
}
