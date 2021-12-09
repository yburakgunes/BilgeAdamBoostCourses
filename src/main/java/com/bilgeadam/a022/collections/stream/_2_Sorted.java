package com.bilgeadam.a022.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_Sorted {
	
	public static void main(String[] args) {
		
		// sorted küçükten büyüğe doğru sıralama
		// collect: gunun sonunda verileri paketle liste olarak göster (Yemeği
		// mühürledim)
		List<String> listem = Arrays.asList("Malatya", "Nevşehir", "Elazığ", "Bitlis");
		
		listem.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		listem.forEach(System.out::println);
		
		Arrays.asList("Malatya", "Nevşehir", "Elazığ", "Bitlis").stream().sorted().collect(Collectors.toList())
				.forEach(System.out::println);
	}
	
}
