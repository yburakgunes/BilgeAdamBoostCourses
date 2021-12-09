package com.bilgeadam.boost.javacourse01.lesson25;

public class MilkProduct extends Product implements ISpoilable {
	
	public MilkProduct(String name, double price, String productionDate) {
		super(name, price, productionDate);
		// TODO Auto-generated constructor stub
	}
	
	private String brandName;
	private int duration;
	
	@Override
	public String toString() {
		return "MilkProduct [brandName=" + brandName + ", duration=" + duration + ", name=" + getName() + ", price="
				+ getPrice() + ", productionDate=" + getProductionDate() + "]";
	}
	
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
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
	
	@Override
	public boolean isSpoiled() {
		String prodDate = this.getProductionDate();
		String day = prodDate.substring(8, 10);
		int dd = Integer.parseInt(day);
		if (dd + MAX_DAYS > 10)
			return true;
		else
			return false;
	}
	
}
