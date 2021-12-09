package com.bilgeadam.a022.collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
	public static void main(String[] args) {
		List<Student> listem = new ArrayList<Student>();
		listem.add(new Student("Burak", "Gunes"));
		listem.add(new Student("Ahmet", "Gunes"));
		listem.add(new Student("Kemal", "Gunes"));
		listem.add(new Student("olcay", "Gunes"));
		listem.add(new Student("tuana", "Gunes"));
		listem.add(new Student("simay", "Gunes"));
		listem.add(new Student("ilayda", "Gunes"));
		listem.add(new Student("Ahmet3", "Gunes"));
		listem.add(new Student("Burak2", "Gunes"));
		listem.add(new Student("Burak4", "Gunes"));
		listem.add(new Student("Burak4", "Gunes"));
		listem.add(new Student("Burak3", "Gunes"));
		listem.add(new Student("Ahmet3", "Gunes"));
		
		List<String> listem2 = listem.stream().map(Student::getAdi).filter((temp) -> temp.startsWith("Burak"))
				.collect(Collectors.toList());
		
		listem2.forEach(s -> System.out.println(s));
		
		String name = "Burak";
		
		List<Student> listem3 = listem.stream().filter((temp) -> name.equals(temp)).collect(Collectors.toList());
		
		listem3.forEach(s -> System.out.println(s));
		
		List<Integer> sayilar = new ArrayList<Integer>();
		sayilar.add(1);
		sayilar.add(2);
		sayilar.add(3);
		sayilar.add(4);
		sayilar.add(5);
		
		List<Integer> num = sayilar.stream().filter(i -> i == 5).collect(Collectors.toList());
		num.forEach(System.out::println);
		
		List<Integer> sum = sayilar.stream().map(i -> i + 5).collect(Collectors.toList());
		sum.forEach(s -> System.out.println(s));
	}
	
}
