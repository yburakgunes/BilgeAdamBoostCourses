package com.bilgeadam.a014.classexamples;

public class ClassMainTest {
	// System.gc();
	// ClassTutorials class1;
	// class1 = new ClassTutorials();
	// class2.
	
	// System.out.println(class2.getClass());
	
	public static void main(String[] args) {
		
		// static yapının önemi : new oluşturmadan erişim sağlamak.
		ClassTutorials.telephoneBrand = "asd";
		
		// instance: örnekleme (new)
		ClassTutorials class2 = new ClassTutorials();
		class2.setTelephonePrice(14000.0);
		System.out.println(class2.getTelephonePrice());
	}
	
}
