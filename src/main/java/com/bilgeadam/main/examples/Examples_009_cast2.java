package com.bilgeadam.main.examples;

import java.util.Scanner;

public class Examples_009_cast2 {
	
	public static void main(String[] args) {

//		null ==>
//		sýfýr
//		boxing unboxing nedir?
		// primitive type:
		// int sayi =5;
		// wrapper class
		// kullanýcýdan almýþ olduðumuz byte türündeki primitive sayýyý boxing yapacaðýz
		
		Scanner klavye = new Scanner(System.in);
		System.out.print("Lütfen bir sayý giriniz: ");
		byte sayi1 = klavye.nextByte();
		byte sayi2 = Byte.valueOf(sayi1);
		System.out.println("Sonuç: "+ sayi2);
		
		//unboxing
		Long wrapperSayi = new Long(44);
		long primitiveSayi= wrapperSayi;
	}
	
}
