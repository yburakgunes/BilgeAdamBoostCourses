package com.bilgeadam.penhomework;

public class FountainPen extends CommonVariablesPen {
	protected String color;
	protected String ink;
	
	public FountainPen() {
		// TODO Auto-generated constructor stub
	}
	
	public FountainPen(String price, String model, String color, String ink) {
		super(price, model);
		this.color = color;
		this.ink = ink;
	}
	
	@Override
	public String toString() {
		return "FountainPen [color=" + color + ", ink=" + ink + ", price=" + price + ", model=" + model + "]";
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getInk() {
		return ink;
	}
	
	public void setInk(String ink) {
		this.ink = ink;
	}
	
}
