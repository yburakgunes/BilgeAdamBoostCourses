package com.bilgeadam.a007.string;

public class StringBuilderExamples {
	
	public static void main(String[] args) {
		
//		StringBuilder builder= new StringBuilder();
//		builder.append("Burak").append("Güneş").append("JavaSE").append(44);
//		String birlestir = builder.toString();
//		System.out.println(birlestir);
		
		StringBuffer builder= new StringBuffer();
		builder.append("Burak").append("Güneş").append("JavaSE").append(44);
		String birlestir = builder.toString();
		System.out.println(birlestir);
	}
	
}
