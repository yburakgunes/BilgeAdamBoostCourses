package com.bilgeadam.a014.classexamples;
// object:
// class= class+class+class ...
// paketler
// Pascal Case: ClassTutorials

// global scope
// local scope
// nesne değişkeni
// class değişkeni
// final
// access modifier:
// public: bonkör her taraftan erişim sağlıyor
// private: sadece o classta çalışırı. Getter and setter ile oluşturulur.

public class ClassTutorials {
	
	public static String telephoneBrand;
	private double telephonePrice;
	private String telephoneColor;
	private boolean isProduction;
	private int yearOfProduction;
	
	// getter and setter
	
	public double getTelephonePrice() {
		return telephonePrice;
	}
	
	// this yapısı global değişkenlere erişim sağlamak içi kullanıyoruz.
	public void setTelephonePrice(double telephonePrice) {
		this.telephonePrice = telephonePrice;
	}
	
	public String getTelephoneColor() {
		return telephoneColor;
	}
	
	public void setTelephoneColor(String telephoneColor) {
		this.telephoneColor = telephoneColor;
	}
	
	public boolean isProduction() {
		return isProduction;
	}
	
	public void setProduction(boolean isProduction) {
		this.isProduction = isProduction;
	}
	
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
}
