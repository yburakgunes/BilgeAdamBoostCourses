package com.bilgeadam.boost.javacourse01.lesson42;

public class FactoryProvider {
	
	public static AbstractFactory getFactory(String factoryType) {
		
		if ("hayvan".equalsIgnoreCase(factoryType))
			return new AnimalFactory();
		else
			return new ColorFactory();
	}
}
