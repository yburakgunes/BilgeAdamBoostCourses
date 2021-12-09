package com.bilgeadam.compositionavm;

public class Store extends CommonVariables {
	private String storeName;
	private String productName;
	private double price;
	private Avm avm;
	
	public Store() {
	}
	
	public Store(String logsDate, int id, String storeName, String productName, double price) {
		super(logsDate, id);
		this.storeName = storeName;
		this.productName = productName;
		this.price = price;
		
	}
	
	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", productName=" + productName + ", price=" + price + ", logsDate="
				+ logsDate + ", id=" + id + "]";
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Avm getAvm() {
		return avm;
	}
	
	public void setAvm(Avm avm) {
		this.avm = avm;
	}
	
}
