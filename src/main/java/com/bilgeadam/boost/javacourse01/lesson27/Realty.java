package com.bilgeadam.boost.javacourse01.lesson27;

import java.io.Serializable;
import java.time.LocalDate;

public class Realty implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private Address adr;
	private Dimension dim;
	private LocalDate listingDate;
	private double price;
	
	public Realty() {
		// TODO Auto-generated constructor stub
	}
	
	public Realty(String name, Address adr, Dimension dim, LocalDate listingDate) {
		super();
		this.name = name;
		this.adr = adr;
		this.dim = dim;
		this.listingDate = listingDate;
		this.price = 0.0;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAdr() {
		return adr;
	}
	
	public Dimension getDim() {
		return dim;
	}
	
	public LocalDate getListingDate() {
		return listingDate;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Realty [name=" + name + ", adr=" + adr + ", dim=" + dim + ", listingDate=" + listingDate + ", price="
				+ price + "]";
	}
	
}
