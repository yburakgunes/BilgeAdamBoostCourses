package com.bilgeadam.boost.javacourse01.lesson42.animal;

public class Duck implements Animal {
	
	@Override
	public String getType() {
		
		return "Ördek";
	}
	
	@Override
	public void makeSound() {
		System.out.println("Vak vak");
	}
	
}
