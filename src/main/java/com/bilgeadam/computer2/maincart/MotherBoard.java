package com.bilgeadam.computer2.maincart;

import com.bilgeadam.computer2.CommonProperty;

public class MotherBoard extends CommonProperty {
	protected String price; // nesne değişkeni
	
	public MotherBoard() {
		super();
		
	}
	
	public MotherBoard(String model, String year, String price) {
		super(model, year);
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MotherBoard [price=" + price + ", model()=" + getModel() + ", year()=" + getYear() + "]";
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	// @Override
	// public void deneme1() {
	// System.out.println("Önceden Gövdesizdim Şimdi Gövdeliyim.");
	//
	// }
	
	@Override
	public void deneme2() {
		// TODO Auto-generated method stub
		
	}
}
