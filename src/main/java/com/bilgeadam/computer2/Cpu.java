package com.bilgeadam.computer2;

import com.bilgeadam.computer2.othercommonproperties.IOtherCommonPro;

public abstract class Cpu extends CommonProperty implements IOtherCommonPro {
	private long pinNumber;
	private int price;
	
	public Cpu() {
		// TODO Auto-generated constructor stub
	}
	
	public Cpu(String model, String year, long pinNumber) {
		super(model, year);
		this.pinNumber = pinNumber;
	}
	
	@Override
	public String toString() {
		return "Cpu [pinNumber=" + pinNumber + ", getModel()=" + getModel() + ", getYear()=" + getYear() + "]";
	}
	
	@Override
	public void deneme2() {
		// TODO Auto-generated method stub
		
	}
	
	public long getPinNumber() {
		return pinNumber;
	}
	
	public void setPinNumber(long pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
}
