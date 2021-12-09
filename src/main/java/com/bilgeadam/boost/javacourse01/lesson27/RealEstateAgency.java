package com.bilgeadam.boost.javacourse01.lesson27;

import java.io.Serializable;
import java.util.HashMap;

public class RealEstateAgency implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Address adress;
	private HashMap<String, Realty> realties;
	
	public RealEstateAgency(String name, Address adress) {
		this.name = name;
		this.adress = adress;
		this.realties = new HashMap<>();
	}
	
	public void addRealty(Realty realty) {
		this.realties.put(realty.getName(), realty);
	}
	
	public Realty getRealty(String name) {
		
		return this.realties.get(name);
		
	}

	@Override
	public String toString() {
		return "RealEstateAgency [name=" + name + ", adress=" + adress + ", realties=" + realties + "]";
	}
	
}
