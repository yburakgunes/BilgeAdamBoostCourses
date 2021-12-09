package com.bilgeadam.boost.javacourse01.lesson27;

import java.io.Serializable;
import java.time.LocalDate;

public class House extends Realty implements Serializable{
	
	private static final long serialVersionUID = -1326204580973216843L;
	private int numOfRooms;
	private int levelNumber;
	
	public House(String name, Address adr, Dimension dim, LocalDate listingDate) {
		super(name, adr, dim, listingDate);
		this.numOfRooms = 0;
		this.levelNumber = 0;
	}
	
	public void setPrice(double price) { // bu gereksiz. Zaten realty'nin içinde setPrice'ı public olduğundan her yerde çağırabilirdi.
		super.setPrice(price);  // sadece super kullanımına örnek olsun diye
	}
	
	public int getNumOfRooms() {
		return numOfRooms;
	}
	
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	
	public int getLevelNumber() {
		return levelNumber;
	}
	
	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}
	
}
