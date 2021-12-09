package com.bilgeadam.clientserver3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Base64;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class _Client2 {
	public static void main(String[] args) {
		Scanner klavye = null;
		String password;
		String maskedPassword;
		
		// 127.0.0.1
		String ipAddress = "localhost";
		
		int port = 7777;
		
		// veri göndereceğim
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAddress, 7777).getOutputStream())) {
			klavye = new Scanner(System.in);
			// System.out.println("Lütfen bir sayı giriniz: ");
			// number = klavye.nextLine();
			password = JOptionPane.showInputDialog("Lütfen şifrenizi giriniz: ");
			maskedPassword = Encoder(password);
			System.out.println("Encoded şifreniz: " + maskedPassword);
			dataOutputStream.writeUTF(maskedPassword);
			
		} catch (IOException io) {
			System.out.println("Hata Meydana Geldi");
			io.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private static String Encoder(String password) {
		
		byte[] encodedBytes = Base64.getEncoder().encode(password.getBytes());
		return new String(encodedBytes);
		
	}
}
