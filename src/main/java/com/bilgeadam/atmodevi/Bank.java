package com.bilgeadam.atmodevi;

import java.util.ArrayList;
import java.util.List;

// özellikler
// parametresiz constructor
// parametreli constructor
// method
// toString
// getter and setter

// 1 tane bankam var
public class Bank extends CommonProperty {
	// özellikler
	protected String bankName;
	protected String bankCityName;
	protected String bankLogo;
	
	// listemin içinde birden fazla eft olduğunu söylüyor
	protected List<Eft> bankEftSerial;
	
	// listemde birden fazla havale yapılacağını söylüyor
	protected List<Havale> bankHavaleSerial;
	
	// composition yaparken empati kurmamız lazım
	// bankanın içinde para olacak
	protected List<MoneyWallet> moneyList;
	
	// parametresiz constructor
	public Bank() {
		// yukardaki gibi çağırıp kullanmazsak null pointer yeriz o yüzden bunu yaptık
		bankHavaleSerial = new ArrayList<Havale>();
		bankHavaleSerial.add(new Havale("1", "havale1 seri14", "5000")); // listemize havalemizi çağırdık
		bankHavaleSerial.add(new Havale("2", "havale2 seri14", "6000"));
		bankHavaleSerial.add(new Havale("3", "havale3 seri14", "7000"));
		bankHavaleSerial.add(new Havale("4", "havale4 seri14", "8000"));
		
		bankEftSerial = new ArrayList<Eft>();
		bankEftSerial.add(new Eft("1", "eft1 seri141", "2000"));
		bankEftSerial.add(new Eft("2", "eft2 seri141", "3000"));
		bankEftSerial.add(new Eft("3", "eft3 seri141", "4000"));
		bankEftSerial.add(new Eft("4", "eft4 seri141", "5000"));
	}
	
	// parametreli constructor
	public Bank(String id, String bankName, String bankCityName, String bankLogo) {
		super(id);
		this.bankName = bankName;
		this.bankCityName = bankCityName;
		this.bankLogo = bankLogo;
	}
	
	// toString
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankCityName=" + bankCityName + ", bankLogo=" + bankLogo + "]";
	}
	
	// getter and setter
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankCityName() {
		return bankCityName;
	}
	
	public void setBankCityName(String bankCityName) {
		this.bankCityName = bankCityName;
	}
	
	public String getBankLogo() {
		return bankLogo;
	}
	
	public void setBankLogo(String bankLogo) {
		this.bankLogo = bankLogo;
	}
	
	public List<Eft> getBankEftSerial() {
		return bankEftSerial;
	}
	
	public void setBankEftSerial(List<Eft> bankEftSerial) {
		this.bankEftSerial = bankEftSerial;
	}
	
	public List<Havale> getBankHavaleSerial() {
		return bankHavaleSerial;
	}
	
	public void setBankHavaleSerial(List<Havale> bankHavaleSerial) {
		this.bankHavaleSerial = bankHavaleSerial;
	}
	
	public List<MoneyWallet> getMoneyList() {
		return moneyList;
	}
	
	public void setMoneyList(List<MoneyWallet> moneyList) {
		this.moneyList = moneyList;
	}
	
}
