package com.bilgeadam.a007.string;

import java.util.StringTokenizer;

public class SplitExamples {
	
	public static void main(String[] args) {
		String kelime = "Servlet Jsp Jsf& Jdbc Hibernate ";
		String [] dizi = kelime.split("&");
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
			
			//StringTokenizer
			
		StringTokenizer tokenizer = new StringTokenizer (kelime, "& ");
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		
			
			
		}
		
	}
	
}
