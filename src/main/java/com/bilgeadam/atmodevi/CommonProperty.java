package com.bilgeadam.atmodevi;
import java.util.Date;

// özellikler
// parametresiz constructor
// parametreli constructor
// toString
// getter and setter
public class CommonProperty {
	
	// özellikler
	private String id;
	protected Date date;
	
	// parametresiz constructor
	public CommonProperty() {
		this.date = new Date(System.currentTimeMillis()); // burada date'i setledik setterını aşağıdan kaldırdık
	}
	
	// parametreli constructor
	public CommonProperty(String id) {
		super();
		this.id = id;
	}
	
	// toString
	@Override
	public String toString() {
		return "CommonProperty [id=" + id + ", date=" + date + "]";
	}
	
	// method
	
	// getter and setter
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	
}
