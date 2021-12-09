package com.bilgeadam.clientserver;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class _ClientCleanCodes {
	
	public static void main(String[] args) {
		Scanner klavye;
		String number;
		
		try (DataOutputStream dataOutputStream = new DataOutputStream(
				new Socket("localhost", 7777).getOutputStream())) {
			klavye = new Scanner(System.in);
			System.out.println("Lütfen bir sayı giriniz");
			number = klavye.nextLine();
			dataOutputStream.writeUTF(number);
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}