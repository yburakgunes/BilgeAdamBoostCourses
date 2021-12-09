package com.bilgeadam.penhomework;

public class CommonVariablesPen {
	protected String price;
	protected String model;
	
	public CommonVariablesPen() {
	}
	
	public CommonVariablesPen(String price, String model) {
		super();
		this.price = price;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "CommonVariablesPen [price=" + price + ", model=" + model + "]";
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
}
