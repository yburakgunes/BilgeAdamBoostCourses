package com.bilgeadam.clientserver3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class _Client {
	public static void main(String[] args) {
		Scanner klavye = null;
		String name;
		
		// 127.0.0.1
		String ipAddress = "localhost";
		
		int port = 7777;
		
		// veri göndereceğim
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAddress, 7777).getOutputStream())) {
			klavye = new Scanner(System.in);
//			System.out.println("Lütfen bir sayı giriniz: ");
//			number = klavye.nextLine();
			name = JOptionPane.showInputDialog("Lütfen isminizi giriniz: ");
			dataOutputStream.writeUTF(name);
			
		} catch (IOException io) {
			System.out.println("Hata Meydana Geldi");
			io.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
