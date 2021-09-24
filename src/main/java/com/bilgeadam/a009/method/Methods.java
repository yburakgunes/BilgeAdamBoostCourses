package com.bilgeadam.a009.method;

//
// scope
// method
// static s�n�f de�i�kenler
// overloading

public class Methods {
	
	// 1- voidli parametresiz
	
	public static void voidliParametresiz() {
		System.out.println("Ben voidli parametresiz metodum");
	}
	
	// 2- voidli parametreli
	public static void voidliParametreli(String adiSoyadi) {
		System.out.println(adiSoyadi);
		
		//overloading = parametre say�lar� farkl� olan metotlara denir.
		
	}
	
	// 3- voidsiz parametresiz
	
	public static String voidsizParametresiz() {
		
		return "�zmir";
		
	}
	
	// 4- voidsiz parametreli
	// int= d�� d�nyaya bir �eyler g�ndermek i�in
	// (int sayi1, int sayi2) = d�� d�nyadan bir �eyler almak
	// return ) = geriye g�nderir.
	
	public static int voidsizParametreli(int sayi1, int sayi2) {
		return sayi1 + sayi2;
		
	}
	
	public static void main(String[] args) {
		voidliParametresiz();
		voidliParametreli("Burak G�ne�");
		// String adi= voidsizParametresiz();
		// System.out.println(adi);
		System.out.println(voidsizParametresiz());
		
		int toplam = voidsizParametreli(4, 6); // 4 ve 6 arg�mand�r
		System.out.println(toplam);
	}
}
