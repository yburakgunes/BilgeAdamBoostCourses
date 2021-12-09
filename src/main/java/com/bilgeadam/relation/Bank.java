package com.bilgeadam.relation;

public class Bank {
	private String bankName;
	private String bankAdress;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	public Bank(String bankName, String bankAdress) {
		super();
		this.bankName = bankName;
		this.bankAdress = bankAdress;
	}
	
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", bankAdress=" + bankAdress + "]";
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getBankAdress() {
		return bankAdress;
	}
	
	public void setBankAdress(String bankAdress) {
		this.bankAdress = bankAdress;
	}
	
}
