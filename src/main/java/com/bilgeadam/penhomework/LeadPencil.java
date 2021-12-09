package com.bilgeadam.penhomework;

public class LeadPencil extends CommonVariablesPen {
	protected String graphite;
	
	public LeadPencil() {
		// TODO Auto-generated constructor stub
	}
	
	public LeadPencil(String price, String model, String graphite) {
		super(price, model);
		this.graphite = graphite;
	}
	
	@Override
	public String toString() {
		return "LeadPencil [graphite=" + graphite + ", price=" + price + ", model=" + model + "]";
	}
	
	public String getGraphite() {
		return graphite;
	}
	
	public void setGraphite(String graphite) {
		this.graphite = graphite;
	}
	
}
