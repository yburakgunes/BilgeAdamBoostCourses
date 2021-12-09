package com.bilgeadam.a022.collections.stream;

public class Student {
	private String adi;
	private String soyadi;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String adi, String soyadi) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	@Override
	public String toString() {
		return "Student [adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public String getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
}
