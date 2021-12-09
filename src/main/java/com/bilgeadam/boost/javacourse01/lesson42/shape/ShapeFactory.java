package com.bilgeadam.boost.javacourse01.lesson42.shape;

public class ShapeFactory {
	
	public Shape getShape(String name) {
		if (name.equalsIgnoreCase("daire"))
			return new Circle();
		else if (name.equalsIgnoreCase("kare"))
			return new Square();
		else if (name.equalsIgnoreCase("dikdörtgen"))
			return new Rectangle();
		else
			return null;
	}
}
