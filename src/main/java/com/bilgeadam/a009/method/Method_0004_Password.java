package com.bilgeadam.a009.method;

import java.util.Scanner;

public class Method_0004_Password {
	
	// Klavyeden girilen kelimeyi alan algoritma
	public static String scannerVocabulary() {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen kelime giriniz: ");
		String vocabulary = klavye.next();
		return vocabulary;
	}
	
	// kelimyei tersten yazan algoritma
	
	public static String reversePassword(String vocabulary) {
		String temp = "";
		
		for (int i = vocabulary.length() - 1; i >= 0; i--) {
			temp = temp + vocabulary.charAt(i);
			
		}
		
		return temp;
	}
	
	public static String singleLetter(String vocabulary) {
		String temp = "";
		for (int i = 0; i < vocabulary.length(); i++) {
			if (i % 2 == 0) {
				temp += vocabulary.charAt(i);
			}
		}
		return temp;
	}
	
	public static String vowelLetter(String vocabulary) {
		String temp = "";
		int count = 0;
		for (int i = 0; i < vocabulary.length(); i++) {
			if (vocabulary.charAt(i) != 'e') {
				temp += vocabulary.charAt(i);
			} else {
				count++;
			}
		}
		System.out.println("e sayısı: " + count);
		return temp;
		
	}
	
	public static String divisibleByNotFive() {
		String temp = "";
		for (int i = 0; i <= 10; i++) {
			
			if (i % 5 == 0)
				continue;
			else
				temp += i;
			
		}
		return temp;
		
	}
	
	public static void main(String[] args) {
		
		// System.out.println(scannerVocabulary());
		// System.out.println(reversePassword(scannerVocabulary()));
		// System.out.println(vowelLetter(singleLetter(reversePassword(scannerVocabulary()))));
		String value1 = vowelLetter(singleLetter(reversePassword(scannerVocabulary())));
		String value2 = divisibleByNotFive();
		
		// Birleştirme 1
		String value3 = value1 + value2;
		System.out.println("1.birleştirme: " + value3);
		
		// Birleştirme 2
		System.out.println("2.birleştirme: " + value1 + value2);
		
		// Birleştirme 3
		String value4 = value1.concat(value2);
		System.out.println("3.birleştirme: " + value4);
		
		// Birleştirme 4
		StringBuilder builder= new StringBuilder();
		builder.append(value1).append(value2);
		String value5 = builder.toString();
		System.out.println("4.birleştirme: " + value5);
		
		
	}
	
}
