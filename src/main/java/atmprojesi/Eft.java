package atmprojesi;

import java.util.Date;

public class Eft extends CommonProperty {
	
	private String eftName;
	private String eftAmount;
	
	public Eft() {
		
	}
	
	public Eft(String id, String eftName, String eftAmount) {
		super(id);
		
		this.eftAmount = eftAmount;
		this.eftName = eftName;
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
