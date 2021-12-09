package com.bilgeadam.boost.javacourse01.lesson16;

public class VelisGame {
	
	public static void main(String[] args) {

		boolean [] spints= new boolean [1000];
		
		for (int i = 0; i < spints.length; i++) {
			spints [i] = false; //tüm dolapları kapadık
			
		}
	
		
		for (int tour = 0; tour <=1000; tour++) {
			for (int i = 0; i < spints.length;) {
				spints[i] = !spints [i]; // tüm dolapları açtık
				i = i+ tour;
			}
		}
		int count = 0;
		
		for (int i = 0; i < spints.length; i++) {
			if (spints [i]) {
				System.out.println(i + "  ");
				count++;
			}
			
	}
	System.out.println("\n" + count);
			
	}
	
}
