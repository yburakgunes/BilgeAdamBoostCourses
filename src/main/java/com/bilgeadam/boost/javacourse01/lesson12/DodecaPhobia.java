package com.bilgeadam.boost.javacourse01.lesson12;

public class DodecaPhobia {
	
	public static void main(String[] args) {
		
		System.out.println("Seçilen sayý: " + createRandomNumber());
		
	}
	
	private static int createRandomNumber() {
		int retVal = 0;
		
		do {
		
		retVal = (int) (Math.random() * 20) + 1;
		
		} while (retVal == 12);
			
			return retVal;
		
	}
	
}
