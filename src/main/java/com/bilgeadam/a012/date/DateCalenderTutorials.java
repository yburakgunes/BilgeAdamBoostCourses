package com.bilgeadam.a012.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DateCalenderTutorials {
	private static final int PREDICTION = 15;
	
	// metot yapacağız
	// try catch
	// şimdiki zamanın ay'ını alsın
	// switch case ile kontrol edelim
	// 1 = Ocak 2 = Şubat 3 = Mart... 12 =Aralık
	
	public static void getFindDateMonth() {
		
		try {
			
			Date date = new Date();
			switch (date.getMonth() + 1) {
				case 1:
					System.out.println("Ocak");
					break;
				case 2:
					System.out.println("Şubat");
					break;
				case 3:
					System.out.println("Mart");
					break;
				case 4:
					System.out.println("Nisan");
					break;
				case 5:
					System.out.println("Mayıs");
					break;
				case 6:
					System.out.println("Haziran");
					break;
				case 7:
					System.out.println("Temmuz");
					break;
				case 8:
					System.out.println("Ağustos");
					break;
				case 9:
					System.out.println("Eylül");
					break;
				case 10:
					System.out.println("Ekim");
					break;
				case 11:
					System.out.println("Kasım");
					break;
				case 12:
					System.out.println("Aralık");
					break;
				default:
					System.out.println("Ay yoktur.");
					break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// 2021/Ekim/11
	public static void getPatternDate() {
		// LocalDate today = LocalDate.now();
		// System.out.println(LocalDate.now().toString());
		// String formattedDate =
		// today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		// System.out.println(formattedDate);
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMMM dd hh:mm:ss zzzz", locale);
		
		Date date = new Date();
		System.out.println(date);
		String str = dateFormat.format(date);
		System.out.println(str);
	}
	
	// 4 tane hakkım var saat kaç?
	// eğer biz büyük söylersek küçültün. Eğer aradaki fark 2 ise az kaldı yoksa
	// arada çok fark var desin
	// eğer biz küçük söylersek büyütün
	
	public static void clockGame() throws InputMismatchException {
		int timesplayed = 0;
		while (true) {
			int count = 0;
			Scanner scan = new Scanner(System.in);
			Date date = new Date();
			int hours = date.getHours();
			String answer = "";
			timesplayed++;
			System.out.println("Saat tahmini oyununu oynamak ister misiniz? ");
			answer = scan.nextLine();
			
			if (!answer.equalsIgnoreCase("h")) {
				do {
					try {
						System.out.println("Lütfen saat tahmininizi giriniz: ");
						
						int guess = Math.abs(scan.nextInt());
						count++;
						if ((guess <= 23)) {
							{
								if (guess == hours) {
									System.out.println("Tebrikler doğru tahmin ettiniz.");
									System.out.println(count + ". tahmininizde bildiniz");
									break;
									
								} else if ((hours - guess <= 2) && (guess - hours <= 2)) {
									System.out.println("Aradaki fark az kaldı. ");
									System.out.println((PREDICTION - count) + " hakkınız kaldı.");
									count++;
								} else if (guess < hours) {
									System.out.println("Sayınızı büyültün fark çok var");
									System.out.println((PREDICTION - count) + " hakkınız kaldı.");
									count++;
								} else if (guess > hours) {
									System.out.println("Sayınızı küçültün fark çok var");
									System.out.println((PREDICTION - count) + " hakkınız kaldı.");
									count++;
								}
							}
						}
					}
					
					catch (InputMismatchException e) {
						System.out.println("HATA! Lütfen sadece sayı giriniz!");
					}
				} while (true);
			} else {
				System.out.println("Oynanan oyun miktarı = " + timesplayed + ". İyi günler dileriz");
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// getFindDateMonth();
		// getPatternDate();
		clockGame();
	}
}