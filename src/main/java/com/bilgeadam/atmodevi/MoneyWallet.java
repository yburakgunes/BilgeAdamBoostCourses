package com.bilgeadam.atmodevi;
import java.util.Scanner;

// parayla alakalı classımız
// özellikler
// parametresiz constructor
// parametreli constructor
// method
// toString
// getter and setter

// N bankanın birden fazla işi var
public class MoneyWallet extends CommonProperty implements IBankMethods {
	// özellikler
	protected String moneyType; // kağıt para mı demir para mı?
	protected String moneyCurrency; // tr? en? belli bir standardda göstermek istiyorum o yüzden enum
	protected double moneyAmount; // miktarı
	
	// composition yaparken empati kurmamız lazım
	// para bir tane bankada olacak
	protected Bank bank;
	
	// abstract: genel herkes için ortak sınıf değişkenleri için
	// interface: farklı ortak özellikler
	
	// parametresiz constructor
	public MoneyWallet() {
		this.moneyAmount = 0.0;
	}
	
	// parametreli constructor
	public MoneyWallet(String id, String moneyType, String moneyCurrency, double moneyAmount) {
		super(id);
		this.moneyType = moneyType;
		this.moneyCurrency = moneyCurrency;
		this.moneyAmount = moneyAmount;
	}
	
	// toString
	@Override
	public String toString() {
		return "MoneyWallet [moneyType=" + moneyType + ", moneyCurrency=" + moneyCurrency + ", moneyAmount="
				+ moneyAmount + ", getId()=" + getId() + ", getDate()=" + getDate() + "]";
	}
	
	// method
	
	// getter and setter
	public String getMoneyType() {
		return moneyType;
	}
	
	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}
	
	public String getMoneyCurrency() {
		return moneyCurrency;
	}
	
	public void setMoneyCurrency(String moneyCurrency) {
		this.moneyCurrency = moneyCurrency;
	}
	
	public double getMoneyAmount() {
		return moneyAmount;
	}
	
	public void setMoneyAmount(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}
	
	public Bank getBank() {
		return bank;
	}
	
	public void setBank(Bank bank) {
		this.bank = bank;
		
	}
	
	// method
	
	public String scannerValue() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen seçim yapınız");
		System.out.println(
				"1-)Para Görüntüle\n2-)Para Yatır\n3-)Para Çek\n4-)EFT Yap\n5-)Havale Yap\n6-)Mail Gönder\n7-)Çıkış");
		String chooise = klavye.nextLine();
		return chooise;
	}
	
	public boolean isLogin() {
		boolean result = true;
		return result;
	}
	
	public void allMethod() {
		
		boolean res = isLogin();
		if (res) {
			
			// composition Bank ve MoneyWallet üzerine kuruldu
			Bank bank = new Bank("1", "Halkbank", "İstanbul", "Logo4");
			
			MoneyWallet moneyWallet = new MoneyWallet("45x", "kağıt", MoneyCurrency.TR.name(), 25000.0);
			moneyWallet.setBank(bank);
			moneyWallet.getBank().getMoneyList().add(moneyWallet);
			
			// scan methodumu çağırdım
			String key = scannerValue();
			
			// aşağıdaki switchcase örneğini yapmak için 001operatör haftanın günleri
			// örneğine bak
			switch (key) {
				case "1": {
					showMoney();
					break;
				}
				case "2": {
					addMoney(14000.0);
					break;
				}
				case "3": {
					reduceMoney(3000.0);
					break;
				}
				case "4": {
					sendEftMoney(1000.0);
					break;
				}
				case "5": {
					sendHavaleMoney(5000.0);
					break;
				}
				case "6": {
					fakeMail("ayberk546@gmail.com");
					break;
				}
				case "7": {
					System.out.println("Sistemden çıkış yapılıyor");
					System.exit(0);
					break;
				}
				
				default:
					System.out.println("Lütfen belirtilen sayıyı giriniz");
					break;
			}
			
		} else {
			System.out.println("Lütfen giriş yapınız.");
		}
	}
	
	// interface methodlarının içini dolduruyoruz
	@Override
	public void showMoney() {
		System.out.println("paranızın toplam tutarı: " + this.moneyAmount);
		
	}
	
	@Override
	public void addMoney(double money) {
		
		// var olan paranın üzerine ekleme yaptık
		this.moneyAmount += money;
		
	}
	
	@Override
	public void reduceMoney(double money) {
		// var olan parayı çektiğimiz için çıkardık
		// hesabımızda 0 tl varsa burda para çekemememiz için if koşulu oluşturduk
		
		if (moneyAmount > 0) {
			this.moneyAmount -= money;
		} else {
			System.out.println("Yeterli paranız yoktur");
		}
	}
	
	@Override
	public void sendHavaleMoney(double money) {
		Bank bank = new Bank();
		for (Object temp : bank.bankHavaleSerial) {
			System.out.println(temp);
		}
		// havale yaptığımız için pazamız azaldı
		System.out.println(money + " havaleniz gönderildi");
		moneyAmount = moneyAmount - money;
	}
	
	@Override
	public void sendEftMoney(double money) {
		Bank bank = new Bank();
		for (Object temp : bank.bankEftSerial) {
			System.out.println(temp);
		}
		// eft yaptığımız için pazamız azaldı
		System.out.println(money + " eftniz gönderildi");
		moneyAmount -= money;
	}
	
	@Override
	public void fakeMail(String emailAddress) {
		System.out.println("Mailiniz gönderildi.");
		
	}
	
}
