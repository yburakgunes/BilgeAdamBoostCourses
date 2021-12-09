package com.bilgeadam.computer;
// parametreli
// parametresiz
// toString
// Method
// getter and setter

public class CommonVariables {
	
	protected String model = "";
	
	public CommonVariables() {
		
		
	}

	public CommonVariables(String model) {
		super();
		this.model = model;
	}

	//Override
	@Override
	public String toString() {
		return "CommonVariables [model=" + model + "]";
	}

	//getter and setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	
}
