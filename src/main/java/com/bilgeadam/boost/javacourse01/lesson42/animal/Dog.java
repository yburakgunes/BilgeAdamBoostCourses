package com.bilgeadam.boost.javacourse01.lesson42.animal;

public class Dog implements Animal {
	
	@Override
	public String getType() {
		return "Köpek";
	}
	
	@Override
	public void makeSound() {
		System.out.println("Hav hav");
	}
	
}
