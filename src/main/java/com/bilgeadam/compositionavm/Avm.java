package com.bilgeadam.compositionavm;

import java.util.List;

public class Avm extends CommonVariables {
	protected String name;
	protected int fdate;
	protected String location;
	
	protected List<Store> storeList;
	
	public Avm() {
		// TODO Auto-generated constructor stub
	}
	
	public Avm(String logsDate, int id, String name, int fdate, String location) {
		super(logsDate, id);
		this.name = name;
		this.fdate = fdate;
		this.location = location;
	}
	

	
	@Override
	public String toString() {
		return "Avm [name=" + name + ", fdate=" + fdate + ", location=" + location + "]";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getFdate() {
		return fdate;
	}
	
	public void setFdate(int fdate) {
		this.fdate = fdate;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public List<Store> getStore() {
		return storeList;
	}
	
	public void setStore(List<Store> storeList) {
		this.storeList = storeList;
	}
	
}
