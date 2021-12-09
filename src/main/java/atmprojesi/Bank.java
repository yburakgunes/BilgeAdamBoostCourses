package atmprojesi;

import java.util.ArrayList;
import java.util.List;

// özellikler
// Parametresiz constructor
// Parametreli constructor
// toString
// Method
// Getter and setter
public class Bank {
	// özellikler
	protected String bankName;
	protected String bankCityName;
	protected String bankLogo;
	
	// banka Eft class
	protected java.util.List<Eft> bankEftSerial;
	
	// banka Havale class
	// listemde birden fazla Havale yapılacağını söylüyor.
	protected List<Havale> bankHavaleSerial;
	
	// composition
	//empati kur
	protected List <MoneyWallet> moneyList;
	
	// Parametresiz constructor
	public Bank() {
		
		bankHavaleSerial = new ArrayList<Havale>();
		bankHavaleSerial.add(new Havale("1", "havale1 seri140", "5000"));
		bankHavaleSerial.add(new Havale("2", "havale2 seri150", "6000"));
		bankHavaleSerial.add(new Havale("3", "havale3 seri160", "7000"));
		bankHavaleSerial.add(new Havale("4", "havale4 seri170", "8000"));
		
		bankEftSerial = new ArrayList<Eft>();
		bankEftSerial.add(new Eft("1", "eft1 seri14", "2000"));
		bankEftSerial.add(new Eft("2", "eft2 seri14", "3000"));
		bankEftSerial.add(new Eft("3", "eft3 seri14", "4000"));
		bankEftSerial.add(new Eft("4", "eft4 seri14", "5000"));
	}
	
	// Parametreli constructor
	public Bank(String bankName, String bankCityName, String bankLogo) {
		this.bankName = bankName;
		this.bankCityName = bankCityName;
		this.bankLogo = bankLogo;
	}
	
	// toString
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankCityName=" + bankCityName + ", bankLogo=" + bankLogo + "]";
	}
	
	// Method
	// Getter and setter
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
	
	public java.util.List<Eft> getBankEftSerial() {
		return bankEftSerial;
	}
	
	public void setBankEftSerial(java.util.List<Eft> bankEftSerial) {
		this.bankEftSerial = bankEftSerial;
	}
	
	public List<Havale> getBankHavaleSerial() {
		return bankHavaleSerial;
	}
	
	public void setBankHavaleSerial(List<Havale> bankHavaleSerial) {
		this.bankHavaleSerial = bankHavaleSerial;
	}
	
}