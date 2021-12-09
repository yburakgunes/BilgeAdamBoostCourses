package com.bilgeadam.a021.generics;

public class MainGenericsClass {
	
	public static void main(String[] args) {
		// instance = new veri ile oluşturmak
		GenericsClass genericsClass = new GenericsClass(44 , "Güneş");
		
		genericsClass.setAdi("Burak");
		genericsClass.setSoyadi("Güneş");
		System.out.println(genericsClass);
		
//		
//		//OOP
//		
//		System.out.println(genericsClass.getAdi());
//		System.out.println(genericsClass.getSoyadi());
		
		
	}
	
}
