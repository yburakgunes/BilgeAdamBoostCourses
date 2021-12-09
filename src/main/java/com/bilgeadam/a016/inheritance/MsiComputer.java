package com.bilgeadam.a016.inheritance;

public class MsiComputer extends Computer {
	
	private String msiSensor;
	
	public MsiComputer() {
		super();
		this.msiSensor = "Lütfen sensör bilgisi giriniz.";
	}
	
	public MsiComputer(String computerName, String computerSerialNumber, String computerMainBoard, String msiSensor) {
		super(computerName, computerSerialNumber, computerMainBoard);
		this.msiSensor = msiSensor;
		
	}
	
	@Override
	public void deneme() {
		super.deneme();
		System.out.println("Msi computer");
	}
	
	
	@Override
	public String toString() {
		return "MsiComputer [msiSensor=" + msiSensor + ", getComputerName()=" + getComputerName()
				+ ", getComputerSerialNumber()=" + getComputerSerialNumber() + ", getComputerMainBoard()="
				+ getComputerMainBoard() + "]";
	}

	public String getMsiSensor() {
		return msiSensor;
	}
	
	public void setMsiSensor(String msiSensor) {
		this.msiSensor = msiSensor;
	}
	
}
