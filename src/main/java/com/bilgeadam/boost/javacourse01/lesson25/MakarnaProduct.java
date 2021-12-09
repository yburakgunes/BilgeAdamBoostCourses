package com.bilgeadam.boost.javacourse01.lesson25;

public class MakarnaProduct extends Product {
	
	public MakarnaProduct(String name, double price, String productionDate) {
		super(name, price, productionDate);
		// TODO Auto-generated constructor stub
	}
	
	private String brandName;
	private String type;
	
	@Override
	public String toString() {
		return "MakarnaProduct [brandName=" + brandName + ", type=" + type + ", toString()=" + super.toString() + "]";
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public void buy(int number) {
		int currentAmount = this.getNumberOfProduct();
		currentAmount += number;
		this.setNumberOfProduct(currentAmount);
		System.out.println(number + this.getName() + " alındı.");
	}
	
	@Override
	public void sell(int number) {
		int currentAmount = this.getNumberOfProduct();
		currentAmount -= number;
		this.setNumberOfProduct(currentAmount);
		System.out.println(number + this.getName() + " satıldı.");
	}
	
}
