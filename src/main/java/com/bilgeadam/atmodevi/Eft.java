package com.bilgeadam.atmodevi;
import java.util.Date;

// özellikler
// parametresiz constructor
// parametreli constructor
// toString
// getter and setter
public class Eft extends CommonProperty {
	
	// özellikler
	private String eftName;
	private String eftAmount;
	
	// parametresiz constructor
	public Eft() {
		
	}
	
	// parametreli constructor
	public Eft(String id, String eftName, String eftAmount) {
		super(id);
		this.eftName = eftName;
		this.eftAmount = eftAmount;
	}
	
	@Override
	public String toString() {
		return "Eft [eftName=" + eftName + ", eftAmount=" + eftAmount + ", getId()=" + getId() + ", getDate()="
				+ getDate() + "]";
	}
	
	public String getEftName() {
		return eftName;
	}
	
	public void setEftName(String eftName) {
		this.eftName = eftName;
	}
	
	public String getEftAmount() {
		return eftAmount;
	}
	
	public void setEftAmount(String eftAmount) {
		this.eftAmount = eftAmount;
	}
	
}
