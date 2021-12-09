package com.bilgeadam.penhomework;

public class BallpointPen extends CommonVariablesPen {
	protected String color;
	protected String cap;
	
	public BallpointPen() {
		// TODO Auto-generated constructor stub
	}
	
	public BallpointPen(String price, String model, String color, String cap) {
		super(price, model);
		this.color = color;
		this.cap = cap;
		
	}
	
	@Override
	public String toString() {
		return "BallpointPen [color=" + color + ", cap=" + cap + ", price=" + price + ", model=" + model + "]";
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String isCap() {
		return cap;
	}
	
	public void setCap(String cap) {
		this.cap = cap;
	}
	
}
