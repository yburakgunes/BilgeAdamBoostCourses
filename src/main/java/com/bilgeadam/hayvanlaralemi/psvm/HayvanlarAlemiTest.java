package com.bilgeadam.hayvanlaralemi.psvm;

import com.bilgeadam.hayvanlaralemi.omurgalılar.EKuslar;
import com.bilgeadam.hayvanlaralemi.omurgalılar.Kuslar;
import com.bilgeadam.hayvanlaralemi.omurgasızlar.Kabuklular;

public class HayvanlarAlemiTest {
	public static void main(String[] args) {
		
		// kuş: papagan, serce, muhabbetkuşu, kartal, atmaca
		// Parametresiz
		Kuslar kus = new Kuslar();
		kus.setAdi(EKuslar.PAPAGAN.name());
		kus.setHareket("Hareket xym");
		kus.setTuketim("Kuş Tüketim");
		kus.setUreme("Kuş üreme");
		kus.setYumurta("Mavi yumurta");
		
		System.out.println(kus);
		
		// parametreli
		Kabuklular kabuk = new Kabuklular("Kabuklu üreme", "Kabuklu tüketim", "Kabuklu Hareket", "Kitin","Böcek");
		System.out.println(kabuk);
	}
}
