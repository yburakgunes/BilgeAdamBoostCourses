package com.bilgeadam.atmodevi;
public class Havale extends CommonProperty {
	
	// özellikler
	private String havaleSerial;
	private String havaleAmount;
	
	// parametresiz constructor
	public Havale() {
		
	}
	
	// parametreli constructor
	public Havale(String id, String havaleSerial, String havaleAmount) {
		super(id);
		this.havaleSerial = havaleSerial;
		this.havaleAmount = havaleAmount;
	}
	
	@Override
	public String toString() {
		return "Eft [eftName=" + havaleSerial + ", eftAmount=" + havaleAmount + ", getId()=" + getId() + ", getDate()="
				+ getDate() + "]";
	}
	
	public String getEftName() {
		return havaleSerial;
	}
	
	public void setEftName(String havaleSerial) {
		this.havaleSerial = havaleSerial;
	}
	
	public String getEftAmount() {
		return havaleAmount;
	}
	
	public void setEftAmount(String havaleAmount) {
		this.havaleAmount = havaleAmount;
	}
}
