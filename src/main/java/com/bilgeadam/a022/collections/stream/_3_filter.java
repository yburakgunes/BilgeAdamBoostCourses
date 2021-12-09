package com.bilgeadam.a022.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _3_filter {
	public static void main(String[] args) {
		
		String sehir = "Malatya";
		List<String> listem = Arrays.asList("Malatya", "yes", "ewqe", "eveve", "tralala","Malatya","Malatya")
				.stream().filter((temp) -> sehir.equals(temp)).collect(Collectors.toList());
		listem.forEach(System.out::println);
		
//		int num=3;
//		List<Integer> sayilar=Arrays.asList(1,2,3,4,5,6,7,15,23,15,12,666,12312512,3,3,3,2)
//				.stream().filter((temp)->num.equals(temp)).collect(Collectors.toList());
//		
		
		
		String sehir3 = "Malatya";
		List<String> listem2 = Arrays.asList("Malatya", "yes", "ewqe", "eveve", "tralala","Malatya","Malatya")
				.stream().filter((temp) -> !temp.equals(sehir)).collect(Collectors.toList());
		listem2.forEach(System.out::println);
		
		
		
		
	}
	
}
