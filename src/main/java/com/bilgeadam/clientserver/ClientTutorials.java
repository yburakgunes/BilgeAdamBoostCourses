package com.bilgeadam.clientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientTutorials {
	public static void main(String[] args) {
		try {
			clientSqrt();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void clientSqrt() throws IOException {
		
		// String
		// database
		// socket programlama
		Socket socket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		BufferedReader data = null;
		
		String value;
		
		try {
			socket = new Socket("localhost", 7777);
			
		} catch (Exception e) {
			System.out.println("port hatası oldu");
			e.printStackTrace();
		}
		
		try {
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Lütfen server'a gönderecek sayıyı giriniz: ");
			data = new BufferedReader(new InputStreamReader(System.in));
			
			while ((value = data.readLine()) != null) {
				System.out.println("Value: " + value);
				System.out.println("Serverdan gelen veri sonucu: " + in.readLine());
				// System.out.println("");
			}
			
		} catch (IOException e) {
			System.out.println("IO Exception istisna durumu yaşanıldı!");
			e.printStackTrace();
		}
		out.close();
		in.close();
		data.close();
		
	}
}
