package com.bilgeadam.a014.classs.exceptionhandling;

import java.io.IOException;

public class _4ThrowsTutorials {
	public static void deneme() throws IOException, ArithmeticException, NullPointerException, Exception {
		int sayi = 0 / 3;
		System.out.println(sayi);
		System.out.println("Program devam ediyor 2222");
	}
	
	public static void deneme5() {
		try {
			deneme();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}