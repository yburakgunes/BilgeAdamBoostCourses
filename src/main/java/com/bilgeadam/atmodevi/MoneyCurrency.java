package com.bilgeadam.atmodevi;
// enum yapısı: sabit bileşenler(değişmeyecek değerleri buraya yazıyoruz)
// constructor private olmalı
// set ile ilgili methodu olmasın çünkü amacımız sabitlemek
// bu yüzden final yapıyoruz ve setterlar iptal oluyor sadece getterlar geliyor
public enum MoneyCurrency {
	TR(1, "tr"), EN(2, "en"), GE(3, "ge");
	
	private final int number;
	private final String curr;
	
	// constructor private oldu
	private MoneyCurrency(int number, String curr) {
		this.number = number;
		this.curr = curr;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getCurr() {
		return curr;
	}
	
}
