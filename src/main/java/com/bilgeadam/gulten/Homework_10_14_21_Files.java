package com.bilgeadam.gulten;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


// 2.SORU
// 2.adım c:sürücüsünü altında kullanıcı tarafından "dizin" adından File ile
// java tarafından dizin oluşturalım

// 3.adım c:\\dizin altına kullanıcı tarafından "bilgeadam.txt" dosya
// oluşturalım bilgeadam.txt dosyası oluşturalım

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

public class Homework_10_14_21_Files {
	
	public static void action(String number) throws IOException {
		Map<String, Object> myStr = newFile();
		String path = (String) myStr.get("path");
		
		Map<String, Object> myFile = newFile();
		File file = (File) myFile.get("file");
		boolean isloop = true;
		
		do {
			
			// if (number.equals("6")) {
			// System.out.println("Dosya ismi: \n" + file.getName() + "Dosya konumu: \n" +
			// file.getAbsolutePath()
			// + "Dosya boyutu: \n" + file.length() + "Dosya listesi: \n" + file.list());
			// }
			
			switch (number) {
				case "0":
					System.out.println("Sistemden çıkılıyor.");
					isloop = false;
					break;
				case "1":
					newFolder();
				case "2":
					newFile();
					break;
				case "3":
					fileWrite(path);
					break;
				case "4":
					readFile(path);
					break;
				case "5":
					deleteFile(file, path);
					break;
				case "6":
					System.out.println("Dosya ismi: \n" + file.getName() + "Dosya konumu: \n" + file.getAbsolutePath()
							+ "Dosya boyutu: \n" + file.length() + "Dosya listesi: \n" + file.list());
					
					break;
				case "6.1":
					System.out.println("Bir klasör müdür: " + file.isDirectory());
					break;
				case "6.2":
					System.out.println("Bir dosya mıdır: " + file.isFile());
					break;
				case "6.3":
					System.out.println("Yazdırılabilir mi: " + file.canWrite());
					break;
				case "6.4":
					System.out.println("Okunabilir mi: " + file.canRead());
					break;
				case "6.5":
					System.out.println("Çalışılabilinir mi: " + file.canExecute());
					break;
			}
			
		} while (isloop);
	}
	
	private static void deleteFile(File file, String path) {
		try {
			
			if (file.exists()) {
				file.delete();
				System.out.println("Dosya Silindi");
			} else {
				System.out.println("Dosya Silinmedi");
				
				System.out.println("path:" + file.toPath());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void readFile(String path) { // Map<String, Object> argumana yazmama ızın vermıyor!!! ben if
												// kullanarak path ve file valuelarını methodumda kullanmak ıstıyorum
												// ????
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			String toplamSatirlar = "";
			String satir = "";
			
			while ((satir = bufferedReader.readLine()) != null) { // () !=null ıcı bos degılse
				toplamSatirlar = toplamSatirlar + satir + "\n";
			}
			
			System.out.println(toplamSatirlar);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	private static void fileWrite(String path) {
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
			
			bufferedWriter.write(ConsoleHelper.readString("Lütfen yazılmasını istediğiniz bilgileri giriniz."));
			bufferedWriter.flush();
			System.out.println("Yazma işlemi başarılı");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String choose() {
		
		String selection = ConsoleHelper.readString(
				"Lütfen yapmak isteğiniz işlemi seçiniz:\n0-Çıkış\n1-Yeni klasör Oluşturma\n2-Yeni dosya oluşturma\n3-Oluşturulan dosyaya veri yazma\n4-Oluşturulan dosyayı okuma\n5-Oluşturulan dosyayı silme\n6-Dosya özellikleri\n6.1-Dosya mı?\n6.2-Dizin mi?\n6.3-Yazılabilrinir mi?\n6.4-Okunabilinir mi?\n6.5-Çalışabilinir mi?");
		;
		return selection;
	}
	
	public static String newFolder() throws IOException { // NEDEN THROWS YAPMAYA ZORLUYOR ???
		String path = "";
		
		path = ConsoleHelper.readString(
				"Lütfen dosya oluşturmak istediğiniz yolu (D:\\\\bilgeAdamDeneme\\\\folder) şeklinde belirtiniz");
		
		File myFolder = new File(path);
		
		boolean bool = myFolder.mkdir();
		if (bool) {
			System.out.println("Klasör oluşturuldu: " + myFolder.getName());
		} else {
			System.out.println("Klasör oluşturulamadı.");
		}
		return path;
	}
	
	public static Map<String, Object> newFile() { // yeni dosya olusturma
		
		Map<String, Object> myMap = new HashMap<>();
		String path = "";
		try {
			path = ConsoleHelper.readString(
					"Lütfen dosya oluşturmak istediğiniz yolu (D:\\\\bilgeAdamDeneme\\\\folder\\\\homework.txt) şeklinde belirtiniz");
			File myFile = new File(path);
			if (myFile.createNewFile()) {
				System.out.println("Dosya oluşturuldu: " + myFile.getName());
				
			} else {
				System.out.println("Dosya zaten mevcut.");
			}
			
			myMap.put("path", path);
			myMap.put("file", myFile);
			
		} catch (IOException e) {
			System.out.println("Hata mevcut.");
			e.printStackTrace();
		}
		
		return myMap;
	}
	
	public static void main(String[] args) throws IOException {
		
		newFolder();
		newFile();
		action(choose());
		
	}
}
