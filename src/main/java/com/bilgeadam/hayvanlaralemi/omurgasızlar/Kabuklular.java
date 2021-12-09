package com.bilgeadam.hayvanlaralemi.omurgasızlar;

import com.bilgeadam.hayvanlaralemi.GenelOzellikler;

public class Kabuklular extends GenelOzellikler implements IOmurgasiz {
	
	private String disIskelet;
	
	public Kabuklular() {
		// TODO Auto-generated constructor stub
	}
	
	public Kabuklular(String ureme, String tuketim, String hareket, String disIskelet,String adi) {
		super(ureme, tuketim, hareket,adi);
		this.disIskelet = disIskelet;
	}
	

	
	@Override
	public String toString() {
		return "Kabuklular [disIskelet=" + disIskelet + ", ureme=" + ureme + ", tuketim=" + tuketim + ", hareket="
				+ hareket + ", adi=" + adi + "]";
	}

	@Override
	public void omurgasiz() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sogukkanli() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void acikdolasim() {
		// TODO Auto-generated method stub
		
	}
	
	public String getDisIskelet() {
		return disIskelet;
	}
	
	public void setDisIskelet(String disIskelet) {
		this.disIskelet = disIskelet;
	}
	
}
