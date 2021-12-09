package com.bilgeadam.clientserver3;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.util.Base64;

// DataInputStream dataInputStream = new DataInputStream(new
// ServerSocket(port).accept().getInputStream())
public class _Server2 {
	public static void main(String[] args) {
		
		// 65536
		int port = 7777;
		
		// Clienttan gelen String yapı.
		String clientValue;
		
		// String bir yapıp tam sayıya çevirmek
		String unmaskedPassword;
		
		System.out.println("Server hazır ");
		// veri alacağım
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			decoder(clientValue);
			unmaskedPassword = decoder(clientValue);
			
			System.out.println("Decoded şifreniz: " + unmaskedPassword);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	private static String decoder(String password) {
		
		byte[] decodedBytes = Base64.getDecoder().decode(password);
		return new String(decodedBytes);
		
	}
}
