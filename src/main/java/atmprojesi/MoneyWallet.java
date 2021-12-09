package atmprojesi;

import java.util.Scanner;

public class MoneyWallet extends CommonProperty implements IBankMethods {
	
	protected String moneyType; // kağıt para mı bozuk para mı?
	protected String moneyCurrency; // tr mi en mi?
	protected double moneyAmount;
	
	// composition
	protected Bank bank;
	
	// parametresiz constructor
	public MoneyWallet() {
		this.moneyAmount = 0.0;
	}
	
	// abstract: genel herkes için ortak
	// interface: farklı ortak özellikler
	
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
	
	// getter setter
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
	
	@Override
	public void showMoney() {
		System.out.println("Paranızın toplam tutarı: " + this.moneyAmount);
	}
	
	@Override
	public void addMoney(double money) {
		this.moneyAmount += money;
	}
	
	
	public String scannerValue() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen seçim yapınız");
		System.out.println("1-) Para Görüntüle\n2-)Para Yatır\\n3-)Para Çek\\n4-)EFT\\n5-)Havale\\n6-)Main Gönder\\n0-) Çıkış");
		
		String choice = klavye.nextLine();
		return choice;
	}
	
//	public void allMethod() {
//		String key = scannerValue();
//		switch (key) {
//			case value:
//				
//				break;
//			
//			default:
//				break;
//		}
//		
//	}
	
	@Override
	public void reduceMoney(double money) {
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
		moneyAmount = moneyAmount - money;
		
	}
	
	@Override
	public void sendEftMoney(double money) {
		Bank bank = new Bank();
		
		for (Object temp : bank.bankEftSerial) {
			System.out.println(temp);
		}
		System.out.println(money + "Eft gönderildi.");
		moneyAmount = moneyAmount - money;
		
	}
	
	@Override
	public void fakeMail(String emailAdress) {
		System.out.println("Mailiniz gönderiliyor...");
	}
	
}
