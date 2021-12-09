package com.bilgeadam.boost.java.course01.util;

public class BilgeAdamUtilsTest {

	public static void main(String[] args) {
		
		System.out.println(BAUtils.dateAsString(Long.parseLong("1632646800")));
		System.out.println(BAUtils.timeAsString(Long.parseLong("1632646800")));
		System.out.println("Enlem / Boylam Sorgusu : " + BAUtils.getDirectData("Edremit","Balýkesir", "TR"));
		System.out.println("Günlük Hava Raporu     : " + BAUtils.getWeatherData(39.5961, 22.0244));
		System.out.println("15 Saatlik Hava Raporu : " + BAUtils.getForecastData("Edremit","Balýkesir", "TR"));
		System.out.println("Hava Kirlilik Raporu   :" + BAUtils.getPolutionData(39.5961, 22.0244));
		
		
//		BAUtils.header("oldu mu?");
//		boolean proceeding = true;
//		do {
//			String str = BAUtils.readString("Lütfen bir deðer giriniz");
//			System.out.println("Okunan deðer: " + str);
//			
//			int j = BAUtils.readInt("Lütfen bir tam sayý giriniz");
//			System.out.println("Okunan deðer: " + j);
//			
//			double d = BAUtils.readDouble("Lütfen bir virgüllü sayý giriniz");
//			System.out.println("Okunan deðer: " + d);
//			
//			int[] inputs = BAUtils.readInt("Lütfen ", "tam sayý giriniz", 4);
//			
//			for (int i = 0; i < inputs.length; i++) {
//				System.out.println(i + ". girilen deðer: " + inputs[i]);
//			}
//			
//			proceeding = BAUtils.proceeding("Devam etmek istiyor musunuz? (Evet / Hayýr)", "Hayýr");
//		} while (!proceeding);
		
		
//		boolean proceed = BAUtils.proceeding("Devam etmek istiyor musunuz) (Evet / Hayýr)", "Evet");
//		System.out.println("Okunan deðer: " + proceed);
//		int[] ints = BAUtils.readInt("Lütfen", "adet tam sayý giriniz", 10);
//		System.out.println("Okunan deðer: " + ints);
		
//		BAUtils.footer();
		
		

	}

}
