package com.bilgeadam.a014.classexamples;

import java.util.Scanner;

public class LoginClass {
	
	// özellikler
	private String name;
	private String lastName;
	private String email;
	private String num;
	
	// parametreli constructor
	// parametresiz constructor
	// constructor : yapıcı metotlardır
	// constructor : classımızda instance oluşturursak (new)
	// return sevmezler
	// overloading yapabiliriz
	// biz eğer constructor oluşturmazsak java arka planda kendisi oluşturur.
	
	// parametresiz constructor
	// Ctrl + space
	
	// default olarak birşeyler yazmak istersek kullanabiliriz.
	
	// PARAMETRESIZ CONSTRUCTOR
	public LoginClass() {
		this.name = "Adınızı girmediniz";
		this.lastName = "Soyadınızı girmediniz";
		this.email = "Emailinizi girmediniz";
		this.num = "Numaranızı girmediniz";
	}
	
	// PARAMETRELI CONSTRUCTOR
	public LoginClass(String name, String lastName, String email, String num) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.num = num;
	}
	// adı ve soyadı
	public LoginClass(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	
	public void loginMethodOrnegi() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen adınızı giriniz: ");
		this.name = scan.nextLine();
		
		System.out.println("Lütfen soyadınızı giriniz: ");
		this.lastName = scan.nextLine();
		
		System.out.println("Lütfen emailinizi giriniz: ");
		this.email = scan.nextLine();
		
		System.out.println("Lütfen telefonunuzu giriniz: ");
		this.num = scan.nextLine();
		
		System.out.println(" adınız: " + name + " soyadınız: " + lastName + " emailiniz:  " + email + " Numaranız:  "
				+ num + "\n ");
		
	}

	@Override
	public String toString() {
		return "LoginClass [name=" + name + ", lastName=" + lastName + ", email=" + email + ", num=" + num + "]";
	}
	
}