package com.bilgeadam.computer.anakart;

import com.bilgeadam.computer.CommonVariables;

public class Anakart extends CommonVariables{
	
	private String year;
	private String price;
	
	public Anakart () {
		
	}

	public Anakart(String model, String price, String year) {
		super(model);
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Anakart [year=" + year + ", model=" + model + ", price=" + price + "]";
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
	
}
