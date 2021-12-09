package com.bilgeadam.doover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringSplit {
	public static void main(String[] args) {
		 String str = "Tuana-nasıl-sın?@!nasıl gi-diyo-r";
		 // String[] asd = str.split("-", 6);
		 String[] asd = str.split("-");
		 
		 List <String> tadaa = new ArrayList<>();
		 tadaa =Arrays.asList(asd);
		 
		 for (int i = 0; i < tadaa.size(); i++) {
			 System.out.println(tadaa.get(i));
			
		}
		 
		 for (String qwe : tadaa) {
			System.out.println(qwe);
			
		}
		 
		 Iterator it = tadaa.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		 
		
//		 for (String a : asd)
//		 System.out.println(a);
		
//		
//		 System.out.printf("Naber nasıl gidiyor");
		
//		 kaç tane karakter olduğunu belirliyoruz!
//		 String yeni = String.format("%05d",14345);
//		
//		 System.out.println(yeni);
		
//		 int[] dizi = { 4, 5, 6, 7, 8, 9 };
//		 for (int i : dizi) {
//		 if (i == 6)
//		 continue;
//		 System.out.print(i + " ");
//		 }
		
//		String temp = " Acaba benimle bugün beraber vakit geçirmek ister misin=?";
//		System.out.println(temp);
//		// StringBuilder builder = new StringBuilder();
//		
//		StringTokenizer str1 = new StringTokenizer(temp, "%");
//		while (str1.hasMoreTokens()) {
//			System.out.print(str1.nextToken());
//		}
//		
//		System.out.println("\n 2. yöntem");
//		
//		String[] asdda = temp.split(" ", 8);
//		
//		for (String stringA : asdda) {
//			System.out.println(stringA);
			
		}
		
	}
	

