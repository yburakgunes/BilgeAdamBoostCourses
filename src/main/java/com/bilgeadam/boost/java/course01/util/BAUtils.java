package com.bilgeadam.boost.java.course01.util;

import java.util.Scanner;

public class BAUtils {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void footer() {
		System.out.println("\tProgramı kulladığınız için teşekkürler");
		System.out.println("\t\tTekrar görüşmek üzere");
		scan.close();
	}
	
	public static void header(String title) {
		// =============
		// ** title **
		// =============
		
		int len = title.length();
		StringBuilder row = new StringBuilder();
		for (int i = 0; i < (len + 6); i++) {
			row.append("=");
		}
		System.out.println("\n\n\t\t" + row);
		System.out.println(("\t\t** " + title.toUpperCase() + " **"));
		System.out.println("\t\t" + row.toString());
		
	}
	
	public static String readString(String query) {
		showQuery(query);
		String retVal = scan.nextLine();
		return retVal;
	}
	
	public static void showQuery(String query) {
		System.out.print("\t" + query + " :");
		
	}
	
	public static int readInt(String query) {
		int retVal = -1;
		showQuery(query);
		retVal = scan.nextInt();
		return retVal;
	}
	
	public static double readDouble(String query) {
		double retVal = -1.0;
		showQuery(query);
		retVal = scan.nextDouble();
		return retVal;
	}
	
	public static void cleanResources() {
		scan.close();
	}
	
	public static boolean proceeding(String question, String positiveAnswer) {
		
		boolean retVal = true;
		
		String answer = readString(question);
		
		retVal = answer.equalsIgnoreCase(positiveAnswer);
		
		return retVal;
	}
}
