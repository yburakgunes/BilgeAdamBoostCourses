package atmprojesi;

import java.util.Date;

public class Havale extends CommonProperty {
	
	private String havaleSerial;
	private String havaleAmount;
	
	public Havale() {
		
	}
	
	public Havale(String id, String havaleSerial, String havaleAmount) {
		super(id);
		
		this.havaleAmount = havaleAmount;
		this.havaleSerial = havaleSerial;
	}
	
	@Override
	public String toString() {
		return "Eft [eftName=" + havaleSerial + ", eftAmount=" + havaleAmount + ", getId()=" + getId() + ", getDate()="
				+ getDate() + "]";
	}
	
	public String getHavaleName() {
		return havaleSerial;
	}
	
	public void setHavaleName(String havaleSerial) {
		this.havaleSerial = havaleSerial;
	}
	
	public String getHavaleAmount() {
		return havaleAmount;
	}
	
	public void setHavaleAmount(String havaleAmount) {
		this.havaleAmount = havaleAmount;
	}
	
}
