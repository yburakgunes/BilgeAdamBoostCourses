package com.bilgeadam.a006.scanner;

import java.util.Random;
import java.util.Scanner;

//zar atma oyunu
public class Scanner_Examples_2 {
	
	public static void main(String[] args) {
		//random olarak
		//Devam etmek için herhangi bir tuşa basınız.
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Devam etmek için bir tuşa basınız: ");
//		klavye.next();
		klavye.hasNext();
		System.out.println("Devam ediyorum");
		Random rndm = new Random();
		
		
		
	}
	
}
