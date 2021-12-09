package com.bilgeadam.boost.javacourse01.lesson42.shape;

public class FactoryTest {
	
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		factory.getShape("kare").draw();
		factory.getShape("dikdörtgen").draw();
		factory.getShape("daire").draw();
		
	}
	
}
