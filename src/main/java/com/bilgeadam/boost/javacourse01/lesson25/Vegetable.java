package com.bilgeadam.boost.javacourse01.lesson25;

public class Vegetable extends Product implements ISpoilable {
	
	public Vegetable(String name, double price, String productionDate) {
		super(name, price, productionDate);
		// TODO Auto-generated constructor stub
	}
	
	private String type; // meyve, salata, sebze
	
	@Override
	public String toString() {
		return "Vegetable [type=" + type + ", name=" + getName() + ", price=" + getPrice() + ", productionDate="
				+ getProductionDate() + "]";
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
		System.out.println(number + " kg sebze alındı.");
	}
	
	@Override
	public void sell(int number) {
		int currentAmount = this.getNumberOfProduct();
		currentAmount -= number;
		this.setNumberOfProduct(currentAmount);
		System.out.println(number + " kg sebze satıldı.");
	}
	
	@Override
	public boolean isSpoiled() {
		String prodDate = this.getProductionDate();
		if (prodDate.startsWith("2020"))
			return true;
		else
			return false;
	}
	
}
