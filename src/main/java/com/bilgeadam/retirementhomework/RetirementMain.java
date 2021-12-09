package com.bilgeadam.retirementhomework;

import java.util.List;
import java.util.Scanner;

public class RetirementMain {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String choice;
		do {
			try {
				Person person = getUserInfo();
				
				if (person instanceof Woman) {
					Woman woman = (Woman) person;
					System.out.println("Yaşınız: " + woman.calculateAge());
					System.out.println("Emeklilik Yaşınız: " + woman.retirementAge());
					System.out.println("Emekliliğe Kalan Yıl: " + woman.yearsToRetirement());
				} else {
					Man man = (Man) person;
					System.out.println("Yaşınız: " + man.calculateAge());
					System.out.println("Emeklilik Yaşınız: " + man.retirementAge());
					System.out.println("Emekliliğe Kalan Yıl: " + man.yearsToRetirement());
				}
				Person.addListPerson(person);
				writeListPerson(Person.getListPerson());
			} catch (IllegalArgumentException e) {
				System.out.println("Ups bir hata.\n" + e.getMessage() + "\nLütfen tekrar deneyiniz.");
			} catch (Exception ex) {
				System.out.println("Hatalı değer girdiniz, lütfen tekrar deneyiniz.");
			}
			System.out.println();
			System.out.println("Devam etmek istiyor musunuz? Çıkmak için 0'a bas!");
			choice = scan.next();
			scan.nextLine();
		} while (!choice.equals("0"));
		
	}
	
	private static void writeListPerson(List<Person> listPerson) {
		for (Person person : listPerson) {
			System.out.println(person);
		}
		
	}
	
	private static Person getUserInfo() {
		String name, surname, date;
		char gender;
		
		System.out.print("Adınızı giriniz: ");
		name = scan.nextLine();
		System.out.print("Soyadınızı giriniz: ");
		surname = scan.nextLine();
		System.out.print("Doğum tarihinizi giriniz(dd-MM-yyyy): ");
		date = scan.nextLine();
		System.out.print("Cinsiyetinizi giriniz:  ");
		gender = scan.next().trim().toUpperCase().charAt(0);
		
		if (gender == 'E') {
			Man man = new Man(name, surname, date);
			return man;
		} else {
			Woman woman = new Woman(name, surname, date);
			return woman;
		}
		
	}
	
}