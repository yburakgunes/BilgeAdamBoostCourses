package com.bilgeadam.computer.usb;

import com.bilgeadam.computer.CommonVariables;

public class Usb extends CommonVariables {
	protected String speed;
	protected String tech;
	
	public Usb() {
		
	}
	
	public Usb(String model, String speed, String tech) {
		super(model);
		
		this.speed = speed;
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "usb [speed=" + speed + ", tech=" + tech + ", model=" + model + "]";
	}
	
	public String getSpeed() {
		return speed;
	}
	
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public String getTech() {
		return tech;
	}
	
	public void setTech(String tech) {
		this.tech = tech;
	}
	
}
