package com.bilgeadam.atmhomework;

import java.util.Scanner;

public class Login1 {
	public static final String USER_EMAIL = "root";
	public static final String USER_PASSWORD = "root";
	
	public static void login() {
		Scanner scan = new Scanner(System.in);
		String username = "";
		String userpassword = "";
		String maskString = "";
		
		String dbuser = USER_EMAIL;
		String dbpassword = USER_PASSWORD;
		
		int attempt = 6;
		
		while (attempt >= -1)
			System.out.println("Lütfen kullanıcı adınız giriniz: ");
		username = scan.nextLine();
		System.out.println("Lütfen şifrenizi giriniz: ");
		userpassword = scan.nextLine();
		
		for (int i = 0; i < userpassword.length(); i++) {
			maskString += maskString;
		}
		System.out.println("Maskelenmiş şifre: " + maskString);
		
		if ((username.equals(dbuser)) && (userpassword.equals(dbpassword))) {
			
			System.out.println("Ana sayfaya yönlendiriliyorsunuz...");
			
		} else {
			System.out.println("Şifre ve ya kullanıcı adını yanlış girdiniz");
			System.out.println("Kalan hakkınız: " + (attempt - 1));
		}
		if (attempt == 1) {
			
			System.out.println("5 kere yanlış giriş işlemi yaptınız lütfen müşteri hizmetlerini arayınız: 444 0 333");
			
		}
		
	}
	
	public static void buttons() {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Lütfen Para Yatırma İşlemi için 1'i , Para çekme işlemi için 2'yi, Havale işlemi için 3'ü, EFT işlemi için 4'ü, Hesap bilgilerinizi emailinize göndermek için 5'i tuşlayınız. Çıkmak için 0'ı tuşlayınız");
		int num = 0;
		num = scan.nextInt();
		
		if ((num > -1) && (num < 6)) {
			switch (num) {
				case 1:
					deposit();
					break;
				case 2:
					withdrawal();
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				default:
					System.out.println("Lütfen belirtilen aralıkta sayı tuşlayınız.");
					break;
			}
		}
		
	}
	
	public static double deposit() {
		Scanner scan = new Scanner(System.in);
		int para = 0;
		int parason = 0;
		
		Userinfo info = new Userinfo();
		info.setFirstName("Burak");
		info.setLastName("Güneş");
		info.setIdNumber("19099523255");
		info.setBalance(5000);
		
		System.out.println(
				"Hoş Geldiniz " + info.getFirstName() + info.getLastName() + "." + " Bakiyeniz: " + info.getBalance());
		System.out.println("Lütfen yatırmak istediğiniz para miktarını giriniz: ");
		
		para = scan.nextInt();
		
		parason = (int) (para + info.getBalance());
		
		System.out.println("Bakiyeniz: " + parason + " TL'dir");
		
		return parason;
	}
	
	public static double withdrawal() {
		Scanner scan = new Scanner(System.in);
		Userinfo info = new Userinfo();
		int para = 0;
		int parason = 0;
		
		System.out.println(
				"Hoş Geldiniz " + info.getFirstName() + info.getLastName() + "." + " Bakiyeniz: " + info.getBalance());
		System.out.println("Lütfen yatırmak istediğiniz para miktarını giriniz: ");
		
		para = scan.nextInt();
		
		if (para <= info.getBalance()) {
			parason = (int) (para - info.getBalance());
			System.out.println("Bakiyeniz: " + parason + " TL'dir");
		} else if (para > (info.getBalance() + 1000.0)) {
			System.out.println(
					"1000 TL miktarında bankadan ekstradan kredi çektiniz. Bu işlemin geri ödemesi 15 gün içerisinde %10 faizle geri yapılması gerekmektedir. İyi günler dileriz...");
		} else {
			System.out.println("Lütfen banka tarafından izin verilen aralıkta para çekme işlemi yapınız.");
		}
		return parason;
	}
	
	public static double transfer(int money) {
		Scanner scan = new Scanner(System.in);
		Userinfo info = new Userinfo();
		int para = 0;
		int parason = 0;
		
		System.out.println(
				"Hoş Geldiniz " + info.getFirstName() + info.getLastName() + "." + " Bakiyeniz: " + info.getBalance());
		System.out.println("Lütfen yatırmak istediğiniz para miktarını giriniz: ");
		
		para = scan.nextInt();
		
		if (para <= info.getBalance()) {
			parason = (int) (para - info.getBalance());
			System.out.println("Bakiyeniz: " + parason + " TL'dir");
		} else if (para > (info.getBalance() + 1000.0)) {
			System.out.println(
					"1000 TL miktarında bankadan ekstradan kredi çektiniz. Bu işlemin geri ödemesi 15 gün içerisinde %10 faizle geri yapılması gerekmektedir. İyi günler dileriz...");
		} else {
			System.out.println("Lütfen banka tarafından izin verilen aralıkta para çekme işlemi yapınız.");
		}
		return parason;
	}
	
	
}
