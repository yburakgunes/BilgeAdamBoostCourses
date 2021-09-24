package com.bilgeadam.a009.method;

//
// scope
// method
// static sýnýf deðiþkenler
// overloading

public class Methods {
	
	// 1- voidli parametresiz
	
	public static void voidliParametresiz() {
		System.out.println("Ben voidli parametresiz metodum");
	}
	
	// 2- voidli parametreli
	public static void voidliParametreli(String adiSoyadi) {
		System.out.println(adiSoyadi);
		
		//overloading = parametre sayýlarý farklý olan metotlara denir.
		
	}
	
	// 3- voidsiz parametresiz
	
	public static String voidsizParametresiz() {
		
		return "Ýzmir";
		
	}
	
	// 4- voidsiz parametreli
	// int= dýþ dünyaya bir þeyler göndermek için
	// (int sayi1, int sayi2) = dýþ dünyadan bir þeyler almak
	// return ) = geriye gönderir.
	
	public static int voidsizParametreli(int sayi1, int sayi2) {
		return sayi1 + sayi2;
		
	}
	
	public static void main(String[] args) {
		voidliParametresiz();
		voidliParametreli("Burak Güneþ");
		// String adi= voidsizParametresiz();
		// System.out.println(adi);
		System.out.println(voidsizParametresiz());
		
		int toplam = voidsizParametreli(4, 6); // 4 ve 6 argümandýr
		System.out.println(toplam);
	}
}
