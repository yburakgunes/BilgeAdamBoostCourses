package com.bilgeadam.a014.classs.exceptionhandling;

public class _6FinallyTutorials {
	public static void main(String[] args) {
		
		try {
			int a = 3 / 0;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// kesin kapatılacak olan bileşenleri buraya alırız.
			System.out.println("kapatılacak : db.close(); ");
			// socket .close();
			
		}
		
	}
}
