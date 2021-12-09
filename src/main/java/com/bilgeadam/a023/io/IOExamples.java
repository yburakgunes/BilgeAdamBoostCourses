package com.bilgeadam.a023.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Seçenekli bir şekilde
// 0-Çıkış
// 1-dosyaCreate
// 2-dizinCreate
// 3-Add(Yazma)
// 4-Read(Okuma)
// 5-Delete(Silmek)
// 6-Dosya özellikleri
// 6.1 Dosya mı
// bu dizin mi ? dosya mı?
// yazılabilrinir mi ? okunabilinir mi çalışabilinir mi?

// URL URI araştırmak ödevi

public class IOExamples {
	public static final String FILE_PATH = "C:\\bilgeadam\\dosya.txt";
	public static Scanner scan = new Scanner(System.in);
	
	public static void writeText() {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {
			// String value = "";
			System.out.println("Lütfen yazdırmak istediğiniz verileri giriniz: ");
			// value = scan.nextLine();
			bufferedWriter.write(scan.nextLine());
			System.out.println("Veriler yazıldı");
			bufferedWriter.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writeTextManuel(String str) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {
			// String value = "";
			System.out.println("Lütfen yazdırmak istediğiniz verileri giriniz: ");
			// value = scan.nextLine();
			bufferedWriter.write(scan.nextLine());
			System.out.println("Veriler yazıldı");
			bufferedWriter.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String readText() {
		String sumOfLines = "";
		String lines = "";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
			
			while ((lines = bufferedReader.readLine()) != null) {
				sumOfLines = sumOfLines + lines + "\n ";
			}
			
			System.out.println(sumOfLines);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sumOfLines;
		
	}
	
	public static String changeLetter(String value) {
		String newValue = "";
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == 'a' | value.charAt(i) == 'A') {
				newValue = value.replace('a', 'e').replace("A", "E");
			}
		}
		
		System.out.println(newValue);
		
		return newValue;
	}
	
	public static void main(String[] args) {
		// writeText();
		// readText();
		String str = readText();
		changeLetter(str);
		writeTextManuel(changeLetter(str));
	}
	
}
