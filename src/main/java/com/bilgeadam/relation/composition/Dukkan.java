package com.bilgeadam.relation.composition;

import java.io.Serializable;

public class Dukkan implements Serializable {
	
	private static final long serialVersionUID = -6556645486317335787L;
	
	private String dukkanAdi;
	private String dukkanMalzemesi;
	
	private Avm avm;
	
	public Dukkan() {
		// TODO Auto-generated constructor stub
	}
	
	public Dukkan(String dukkanAdi, String dukkanMalzemesi) {
		super();
		this.dukkanAdi = dukkanAdi;
		this.dukkanMalzemesi = dukkanMalzemesi;
	}
	
	@Override
	public String toString() {
		return "Dukkan [dukkanAdi=" + dukkanAdi + ", dukkanMalzemesi=" + dukkanMalzemesi + "]";
	}
	
	public String getDukkanAdi() {
		return dukkanAdi;
	}
	
	public void setDukkanAdi(String dukkanAdi) {
		this.dukkanAdi = dukkanAdi;
	}
	
	public String getDukkanMalzemesi() {
		return dukkanMalzemesi;
	}
	
	public void setDukkanMalzemesi(String dukkanMalzemesi) {
		this.dukkanMalzemesi = dukkanMalzemesi;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Avm getAvm() {
		return avm;
	}
	
	public void setAvm(Avm avm) {
		this.avm = avm;
	}
	
}
