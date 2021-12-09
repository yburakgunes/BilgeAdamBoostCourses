package com.bilgeadam.gulten;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConsoleHelper {
	
	public static void printTitle(String msg, int length) {
		
		int oddMsgLeng = msg.length() % 2;
		printLine(length);
		int center = (Math.round((length + 10) / 2) - 5);
		int end = (length + 10) - (center + msg.length());
		print(String.format("%-" + center + "s%s%" + end + "s", "=====", msg, "====="), 2, true);
		printLine(length);
	}
	
	public static int showMenu(String title, Map<Integer, String> menu) {
		
		printTitle(title, 30);
		
		for (Map.Entry<Integer, String> entry : menu.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			print(String.format("[ %02d - %-30s ]", key, val), 2, true);
			
		}
		printLine(30);
		
		return selectDigitSecim();
	}
	
	public static int selectDigitSecim() {
		Scanner scan = new Scanner(System.in);
		String secim;
		do {
			boolean isDigit = true;
			secim = scan.next().trim();
			for (int i = 0; i < secim.length(); i++) {
				if (!Character.isDigit(secim.charAt(i))) {
					isDigit = false;
				}
			}
			
			if (isDigit)
				return Integer.parseInt(secim + "");
			
		} while (true);
	}
	
	public static void print(String msg, int tabCount, boolean ln) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < tabCount; i++) {
			b.append("\t");
		}
		b.append(msg);
		b.append(ln ? "\n" : "");
		System.out.print(b);
		
	}
	
	public static void printLine(int msgLong) {
		int lineLong = (msgLong % 2 == 0) ? msgLong + 10 : msgLong + 11;
		StringBuilder line = new StringBuilder();
		line.append("\t\t");
		for (int i = 0; i < lineLong; i++) {
			line.append("=");
		}
		System.out.printf("%s\n", line);
	}
	
	public static int readInt(String msg) {
		Scanner input = new Scanner(System.in);
		
		do {
			
			try {
				System.out.println(msg);
				int inputInt = input.nextInt();
				return inputInt;
				
			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
		
	}
	
	public static String readString(String msg) {
		Scanner input = new Scanner(System.in);
		
		do {
			
			try {
				System.out.println(msg);
				String inputStr = input.nextLine();
				return inputStr;
				
			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
	}
	
	public static double readDouble(String msg) {
		Scanner input = new Scanner(System.in);
		
		do {
			
			try {
				System.out.println(msg);
				double inputDouble = input.nextDouble();
				return inputDouble;
				
			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
	}
	
	public static boolean isContinue(String msg, String exitKey) {
		
		String key = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		
		do {
			try {
				key = input.next();
				if (key.equalsIgnoreCase(exitKey)) {
					return false;
				} else {
					return true;
				}
			} catch (Exception e) {
				
			}
			
		} while (true);
		
	}
	
	public static Map<String, String> changeTRCharecter(String msg) {
		final List<Character> trKey = Arrays.asList('ö', 'ç', 'ş', 'ı', 'ğ', 'ü', 'Ö', 'Ç', 'Ş', 'İ', 'Ğ', 'Ü');
		final List<Character> enKey = Arrays.asList('o', 'c', 's', 'i', 'g', 'u', 'O', 'C', 'S', 'I', 'G', 'U');
		StringBuilder newStr = new StringBuilder();
		int count = 0;
		char[] charArray = msg.toCharArray();
		for (int i = 0; i < msg.length(); i++) {
			if (trKey.contains(charArray[i])) {
				newStr.append(enKey.get(trKey.indexOf(charArray[i])));
				count++;
			} else {
				newStr.append(charArray[i]);
			}
		}
		Map<String, String> map = new HashMap<>();
		map.put("COUNT", String.valueOf(count));
		map.put("VALUE", newStr.toString());
		
		return map;
		
	}
	
	public static void main(String[] args) {
		
		readInt("Sayı gır");
		readString("String gir");
		
	}
}
