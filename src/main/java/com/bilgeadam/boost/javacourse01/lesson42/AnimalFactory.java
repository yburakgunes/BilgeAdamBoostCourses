package com.bilgeadam.boost.javacourse01.lesson42;

import com.bilgeadam.boost.javacourse01.lesson42.animal.Animal;
import com.bilgeadam.boost.javacourse01.lesson42.animal.Cat;
import com.bilgeadam.boost.javacourse01.lesson42.animal.Dog;
import com.bilgeadam.boost.javacourse01.lesson42.animal.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {
	
	@Override
	public Animal create(String type) {
		if (type.equalsIgnoreCase("kedi"))
			return new Cat();
		else if (type.equalsIgnoreCase("köpek"))
			return new Dog();
		else if (type.equalsIgnoreCase("ördek"))
			return new Duck();
		else
			return null;
	}
	
}
