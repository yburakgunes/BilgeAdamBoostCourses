package com.bilgeadam.a014.classs.exceptionhandling;

public class _1AritmeticExceptionTutorials {
	
	public static void sendMail(Exception e) {
		// System.out.println("Mail" + TryCatchExceptionTutorials.class + e);
	}
	
	public static void main(String[] args) {
		// try catch throw throws finally
		
		// bir sayıyı/sıfıra bölmek = Tanımsız (sonsuz)
		// istisnamız
		// try with resources
		
		// java.lang
		// object
		// throwable
		// 1- exception 2- error
		try {
			int sayi = 3 / 0;
			System.out.println(sayi);
		} catch (ArithmeticException ai) {
			sendMail(ai);
			// e.printStackTrace();
		} catch (Exception e) {
			sendMail(e);
			// e.printStackTrace();
		}
		
		System.out.println("Program devam ediyor...");
	}
}
