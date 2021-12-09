package com.bilgeadam.computer.cpu;

import com.bilgeadam.computer.CommonVariables;

public class Cpu extends CommonVariables {
	protected String name;
	protected String pin;
	
	// Parametresiz
	public Cpu() {
		
	}
	
	// Parametreli
	public Cpu(String model, String name, String pin) {
		
		super(model);
		this.name = name;
		this.pin = pin;
	}
	
	// toString
	@Override
	public String toString() {
		return "Cpu [name=" + name + ", pin=" + pin + ", model=" + model + "]";
	}
	
	// getters setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPin() {
		return pin;
	}
	
	public void setPin(String pin) {
		this.pin = pin;
	}
	
}
