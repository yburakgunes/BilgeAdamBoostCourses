package com.bilgeadam.penhomework;

public class MechanicalPencil extends CommonVariablesPen {
	protected String penpin;
	
	public MechanicalPencil() {
		// TODO Auto-generated constructor stub
	}
	
	public MechanicalPencil(String price, String model, String penpin) {
		super(price, model);
		this.penpin = penpin;
	}
	
	@Override
	public String toString() {
		return "MechanicalPencil [penpin=" + penpin + ", price=" + price + ", model=" + model + "]";
	}
	
	public String getPenpin() {
		return penpin;
	}
	
	public void setPenpin(String penpin) {
		this.penpin = penpin;
	}
	
}
