package com.bilgeadam.computer2.maincart1;

import com.bilgeadam.computer2.maincart.MotherBoard;
import com.bilgeadam.computer2.othercommonproperties.IOtherCommonPro;

public class MotherBoard1 extends MotherBoard implements IOtherCommonPro {
	private String amdCart;
	
	public MotherBoard1() {
		
	}
	
	public MotherBoard1(String model, String year, String price, String amdCart) {
		super(model, year, price);
		this.amdCart = amdCart;
	}
	
	@Override
	public String toString() {
		return "MotherBoard1 [amdCart=" + amdCart + ", getPrice()=" + getPrice() + ", getModel()=" + getModel()
				+ ", getYear()=" + getYear() + "]";
	}
	
	public String getAmdCart() {
		return amdCart;
	}
	
	public void setAmdCart(String amdCart) {
		this.amdCart = amdCart;
	}
	
	@Override
	public String price(String price) {
		return price;
	}
	
	public static void main(String[] args) {
		MotherBoard1 board1 = new MotherBoard1();
		String fiyat = board1.price("asdasd");
		System.out.println(fiyat);
	}
	
}
