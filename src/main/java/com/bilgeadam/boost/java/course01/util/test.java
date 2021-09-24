package com.bilgeadam.boost.java.course01.util;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BAUtils.header("oldu mu?");
		
		for (int i = 0; i < 10; i++) {
			String str = BAUtils.readString("Lütfen bir değer giriniz");
			
			System.out.println("Okunan değer: " + str);
			int j = BAUtils.readInt("Lütfen bir tam sayı giriniz");
			System.out.println("Okunan değer: " + j);
			double d = BAUtils.readDouble("Lütfen bir tam say� giriniz");
			System.out.println("Okunan değer: " + d);
			
			boolean proceed = BAUtils.proceeding("Devam etmek istiyor musunuz? (Evet / Hayır", "Evet");
			System.out.println("Okunan değer" + proceed);
		}
		BAUtils.footer();
	}
	
}
