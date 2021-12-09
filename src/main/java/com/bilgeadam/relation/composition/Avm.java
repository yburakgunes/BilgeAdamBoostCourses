package com.bilgeadam.relation.composition;

import java.io.Serializable;
import java.util.List;

public class Avm implements Serializable {
	
	private static final long serialVersionUID = -360902814465052828L;
	
	private String avmAdi;
	private String avmSehir;
	
	List<Dukkan> dukkanList;
	
	public Avm() {
		// TODO Auto-generated constructor stub
	}
	
	public Avm(String avmAdi, String avmSehir) {
		this.avmAdi = avmAdi;
		this.avmSehir = avmSehir;
	}
	
	@Override
	public String toString() {
		return "Avm [avmAdi=" + avmAdi + ", avmSehir=" + avmSehir + "]";
	}
	
	public String getAvmAdi() {
		return avmAdi;
	}
	
	public void setAvmAdi(String avmAdi) {
		this.avmAdi = avmAdi;
	}
	
	public String getAvmSehir() {
		return avmSehir;
	}
	
	public void setAvmSehir(String avmSehir) {
		this.avmSehir = avmSehir;
	}

	public List<Dukkan> getDukkanList() {
		return dukkanList;
	}

	public void setDukkanList(List<Dukkan> dukkanList) {
		this.dukkanList = dukkanList;
	}
	
}
