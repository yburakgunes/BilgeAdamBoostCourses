package com.bilgeadam.a012.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateCalendarTutorialss {
	// metot yapacağız.
	// try catch.
	// şimdiki zamanın ay'ını alsın.
	// switch case ile kontrol edelim.
	// 1 =ocak 2=şubat 3=mart 4 ... 12=Aralık.
	public static void getFindMonthDate() {
		try {
			Date date = new Date();
			// Aylar: 0:ocak -11
			switch (date.getMonth() + 1) {
				case 1:
					System.out.println("ocak");
					break;
				case 2:
					System.out.println("şubat");
					break;
				case 3:
					System.out.println("mart");
					break;
				case 4:
					System.out.println("nisan");
					break;
				case 5:
					System.out.println("mayıs");
					break;
				case 6:
					System.out.println("haziran");
					break;
				case 7:
					System.out.println("temmuz");
					break;
				case 8:
					System.out.println("ağustos");
					break;
				case 9:
					System.out.println("eylül");
					break;
				case 10:
					System.out.println("ekim");
					break;
				case 11:
					System.out.println("kasım");
					break;
				case 12:
					System.out.println("aralık");
					break;
				default:
					System.out.println("sayı yoktur");
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// SimpleDateFormat kullanarak 2021/Ekim/11
	public static void getPatternDate() {
		// long: System.out.println(System.currentTimeMillis());
		// Locale
		try {
			Locale locale = new Locale("tr", "TR");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss zzzz", locale);
			Date date = new Date();
			String str = dateFormat.format(date);
			System.out.println(str);
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getClockGame() {
		try {
			Date date = new Date();
			// bana saati veriyor.
			int hours = date.getHours();
			System.out.println(hours);
			Scanner klavye = new Scanner(System.in);
			// count: hak prediction:tahmin
			int count = 10, prediction = 0, howManyCounterGame = 0;
			while (count > 0) {
				System.out.println("Hakkınız: " + count);
				System.out.println("Tahmin Sayınız: " + prediction);
				System.out.println("Lütfen sayı giriniz\n");
				// Kullanıcı eğer sayı girmezse bunu söyliyelim sayı girmesini zorlayalım
				// negatif sayı girdiniz harf giremezsin
				// 01 23
				int hoursScanner = Math.abs(klavye.nextInt());
				// 17-15 =+2 17-19=-2
				int different = hours - hoursScanner;
				if (different == 0) {
					System.out.println("Tebrikler sayıyı bildiniz. " + prediction + ".tahminde buldunuz");
					// Tekrar oynamak ister misiniz ? E H kullanıcı küçük harf yada büyük harf
					// girsin farketmez
					// eğer E= tekrar oynasın H=basarsa Çıkış yapılsın
					// Toplam kaç kere oyun oynadı
					break;
				} else if (different == -2) {
					System.out.println("Büyük sayı girdiniz aradaki fark çok az");
					count--;
					prediction++;
				} else if (different == 2) {
					System.out.println("Küçük sayı girdiniz aradaki fark çok az");
					count--;
					prediction++;
				} else if (different > 2) {
					System.out.println("Küçük sayı girdiniz aradaki fark çok fazla");
					count--;
					prediction++;
				} else if (different > -2) {
					System.out.println("Büyük sayı girdiniz aradaki fark çok fazla");
					count--;
					prediction++;
				} else {
					System.out.println("Yanlış girildi");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 14.00 12
	// 15 tane hakkım var saat kaç, kaçıncı denemede sayıyı buldum ?
	// eğer biz yüksek söylersek sayınızı küçültün eğer aradaki fark:2 ise az kaldı
	// yoksa aradaki çok fark var
	// eğer yüksek söylersek sayınızı büyültün fark:2 ise az kaldı yoksa aradaki çok
	// fark var
	public static void main(String[] args) {
		// getFindMonthDate();
		// getPatternDate();
		getClockGame();
	}
}