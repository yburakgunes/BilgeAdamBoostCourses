package com.bilgeadam.hayvanlaralemi.omurgalılar;

import com.bilgeadam.hayvanlaralemi.GenelOzellikler;

public class Kuslar extends GenelOzellikler implements IOmurgali {
	
	private String yumurta;
	
	public Kuslar() {
		// TODO Auto-generated constructor stub
	}
	
	public Kuslar(String ureme, String tuketim, String hareket, String yumurta, String adi) {
		super(ureme, tuketim, hareket, adi);
		this.yumurta = yumurta;
		
	}
	
	@Override
	public String toString() {
		return "Kuslar [yumurta=" + yumurta + ", ureme=" + ureme + ", tuketim=" + tuketim + ", hareket=" + hareket
				+ ", adi=" + adi + "]";
	}
	
	@Override
	public void omurgali() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void sıcakkanli() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void kapalidolasim() {
		// TODO Auto-generated method stub
		
	}
	
	public String getYumurta() {
		return yumurta;
	}
	
	public void setYumurta(String yumurta) {
		this.yumurta = yumurta;
	}
	
}
