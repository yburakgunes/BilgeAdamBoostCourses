package com.bilgeadam.computer.mouse;

import com.bilgeadam.computer.CommonVariables;

public class Mouse extends CommonVariables {
	protected int dpi;
	protected int weight;
	protected String price;
	
	public Mouse() {
		
	}
	
	public Mouse(String model, String price, int dpi, int weight) {
		super(model);
		this.dpi = dpi;
		this.weight = weight;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Mouse [dpi=" + dpi + ", weight=" + weight + ", model=" + model + ", price=" + price + "]";
	}
	
	public int getDpi() {
		return dpi;
	}
	
	public void setDpi(int dpi) {
		this.dpi = dpi;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
}
