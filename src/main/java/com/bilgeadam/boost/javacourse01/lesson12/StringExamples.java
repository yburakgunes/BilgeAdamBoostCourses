package com.bilgeadam.boost.javacourse01.lesson12;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringExamples {
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		String input;
		String str = "";
		do {
			System.out.println("Bir metin giriniz: ");
			input = inp.next();
			if (!input.endsWith("it")) {
				str += input;
			} else {
				break;
			}
			int idx = str.indexOf("ý");
			char[] chars = str.toCharArray();
			if (idx >= 0) {
				chars[idx] = 'i';
			}
			
			StringTokenizer tokens = new StringTokenizer(str, "|");
			int i = 0;
			while (tokens.hasMoreElements()) {
				String s = tokens.nextToken();
				if (i == 1) {
					s.concat("").concat("Tavuk").concat(str);
				}
				i++;
				System.out.println(s);
				System.out.println(s.toUpperCase());
				
			}
			
		} while (!input.equalsIgnoreCase("exit"));
		System.out.println(str);
		inp.close();
	}
	
}
