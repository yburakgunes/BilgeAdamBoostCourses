package com.bilgeadam.boost.javacourse01.lesson27;

import java.io.Serializable;
import java.time.LocalDate;

public class Land extends Realty implements Serializable{
	private static final long serialVersionUID = 1L;

	public Land(String name, Address adr, Dimension dim, LocalDate listingDate) {
		super(name, adr, dim, listingDate);
		// TODO Auto-generated constructor stub
	}
	
	public Land(String name, Address adr, Dimension dim, LocalDate listingDate, double price) {
		super(name, adr, dim, listingDate);
		this.setPrice(price);
	}
	
	@Override
	public String toString() {
		return "Land [toString()=" + super.toString() + "]";
	}
	
}
