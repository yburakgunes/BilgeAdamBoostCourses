package com.bilgeadam.a013.arrays;

import java.util.Random;

public class RandomTutorial {
	
	public static void main(String[] args) {
		// Random = rastgele sayılar veren yapıdır.
		
		// Math = Random
		// Class düzeyinde olan
		
		// 1-) Math=Random
		double rastgeleSayi = Math.floor(Math.random() * 5 + 1);
		
		System.out.println(rastgeleSayi);
		
		Random rastgeleClass = new Random();
		
		//1<=X<=9
		int rastgeleSayi2 = rastgeleClass.nextInt(9) + 1;
		System.out.println(rastgeleSayi2);
		
	}
	
}
