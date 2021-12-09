package com.bilgeadam.a021.generics;

// private ==> sadece o classtakiler erişebilir.
// Generics Class
public class GenericsClass <T>{
	
	// sadece o classtakiler erişebilir.
	
	// Nesne değişkeni sınıf değişkeni (Global değişkenleri)
	private T adi;
	private String soyadi;
	
	// parametresiz constructor
	// Ctrl + Space
	public GenericsClass() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	// shift + Alt + S SAS komandoları
	
	// this ==> 2 tane yapı için kullanıyoruz.
	// Global değişkenlere erişmek için
	// Başka Contructorları çağırmak için
	public GenericsClass(T adi, String soyadi) {
		// super();
		this.adi = adi;
		this.soyadi = soyadi;
	}

	// getter and setter
	// shift + Alt + S SAS komandoları
	public T getAdi() {
		return adi;
	}

	public void setAdi(T adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	@Override
	public String toString() {
		return "GenericsClass [adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
	
}
