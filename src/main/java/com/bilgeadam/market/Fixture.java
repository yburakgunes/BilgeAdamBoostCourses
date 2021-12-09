package com.bilgeadam.market;

import java.util.Date;

public class Fixture {
	private long inventoryID;
	private String description;
	private int lifetime;
	private boolean rented;
	private Date inventoryDate;
	private String material;
	
	public Fixture(long inventoryID, String description, int lifetime, boolean rented, Date inventoryDate,
			String material) {
		super();
		this.inventoryID = inventoryID;
		this.description = description;
		this.lifetime = lifetime;
		this.rented = rented;
		this.inventoryDate = inventoryDate;
		this.material = material;
	}
	
	public long getInventoryID() {
		return inventoryID;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getLifetime() {
		return lifetime;
	}
	
	public boolean isRented() {
		return rented;
	}
	
	public Date getInventoryDate() {
		return inventoryDate;
	}
	
	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "Fixture [inventoryID=" + inventoryID + ", description=" + description + ", lifetime=" + lifetime
				+ ", rented=" + rented + ", inventoryDate=" + inventoryDate + ", material=" + material + "]";
	}
	
}
