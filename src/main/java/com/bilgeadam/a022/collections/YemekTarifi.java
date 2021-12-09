package com.bilgeadam.a022.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Akşam yemeğine ben Bugün ne yapsam?
// Ana yemekler ==> kuru fasulye, adana kebap, pilav vs
// Sıcak yemek ==> Mercimek, domates, tarhana çorbası
// İçeçekler ==> Kola, Fanta, Su, Soda
// Yemekten sonra içilecekler ==> Türk kahvesi,
// Tatlılar ==> Revani, kıbrıs tatlılar
// Array ==> length
// Collention ==> size()
// String ==> length ()

// adanakebap, mercimekcorbası, soda, çay, revani

public class YemekTarifi {
	
	//rastgele ile ilgili bunu kullanıcaz.
	public static int rastgele(int sayi) {
		Random random = new Random();
		int randomSayi = random.nextInt(sayi);
		
		return randomSayi;
	}
	
	public static String gunler() {
		Random rnd = new Random();
		String[] day = new String[7];
		day[0] = "Pazartesi";
		day[1] = "Salı";
		day[2] = "Çarşamba";
		day[3] = "Perşembe";
		day[4] = "Cuma";
		day[5] = "Cumartesi";
		day[6] = "Pazar";
		
		// int number = rnd.nextInt(day.length);
		// System.out.println(day[number]);
		
		int number = rastgele(day.length);
		return day[rastgele(day.length)];
	}
	
	public static List<String> anaYemekListesi (){
		List<String> anaYemekListesi = new ArrayList<String>();
		anaYemekListesi.add("Kebap");
		anaYemekListesi.add("Kuru Fasulye");
		anaYemekListesi.add("Pilav");
		anaYemekListesi.add("Nohut");
		anaYemekListesi.add("Pizza");
		anaYemekListesi.add("Lahmacun");
	
		return anaYemekListesi;
	}
	
	public static String anaYemek() {
		return anaYemekListesi().get(rastgele(anaYemekListesi().size()));
	}
	
	public static void main(String[] args) {
		 String gun = gunler(), ana = anaYemek();
//      System.out.println(gunler());
//		
//		String ana = anaYemek();
//		System.out.println(anaYemek());
		 
		 System.out.println(gun + "  " + ana);
		 String hepsi = gun + "  " + ana;
		 System.out.println(hepsi);
		 
		 StringBuilder builder = new StringBuilder();
		 builder.append(gun).append(ana);
		 String cevir = builder.toString();
		 System.out.println(cevir);
		
	}
}
