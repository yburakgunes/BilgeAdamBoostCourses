package com.bilgeadam.atmhomework;

import java.util.Arrays;
import java.util.Random;

public class Userinfo {
	Random rnd = new Random();
	
	private double balance;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String[] transfer = new String[3];
	private String[] eft = new String[2];
	
	public Userinfo() {
		// TODO Auto-generated constructor stub
	}
	
	public Userinfo(double balance, String firstName, String lastName, String idNumber, String[] transfer,
			String[] eft) {
		super();
		this.balance = 5000;
		this.firstName = "Burak";
		this.lastName = "Güneş";
		this.idNumber = "9871321298";
		this.transfer[0] = "Mehmet Dağyaran Hesap No: 23125126131356134";
		this.transfer[1] = "Tuana Sakarya  Hesap No: 1123321512512512512";
		this.transfer[2] = "Ali Atilla Arısoy Hesap No: 1212512642212331231";
		this.eft = eft;
	}
	
	@Override
	public String toString() {
		return "Userinfo [balance=" + balance + ", firstName=" + firstName + ", lastName=" + lastName + ", idNumber="
				+ idNumber + ", transfer=" + Arrays.toString(transfer) + ", eft=" + Arrays.toString(eft) + "]";
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public String[] getTransfer() {
		return transfer;
	}
	
	public void setTransfer(String[] transfer) {
		this.transfer = transfer;
	}
	
	public String[] getEft() {
		return eft;
	}
	
	public void setEft(String[] eft) {
		this.eft = eft;
	}
	
}
