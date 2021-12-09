package com.bilgeadam.computer.keyboard;

import com.bilgeadam.computer.CommonVariables;

public class Keyboard extends CommonVariables {
	
	protected String keyboard;
	
	public Keyboard() {
		
	}
	
	public Keyboard(String model, String keyboard) {
		super(model);
		this.keyboard = keyboard;
	}
	
	@Override
	public String toString() {
		return "Keyboard [keyboard=" + keyboard + ", model=" + model + "]";
	}
	
	public String getKeyboard() {
		return keyboard;
	}
	
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	
}
