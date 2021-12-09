package com.bilgeadam.clientserver2;

import java.io.DataInputStream;
import java.net.ServerSocket;

// DataInputStream dataInputStream = new DataInputStream(new
// ServerSocket(port).accept().getInputStream())
public class _Server {
	public static void main(String[] args) {
		
		// 65536
		int port = 7777;
		
		// Clienttan gelen String yapı.
		String clientValue;
		
		// String bir yapıp tam sayıya çevirmek
		int stringToInteger;
		
		System.out.println("Server hazır ");
		// veri alacağım
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			stringToInteger = Integer.valueOf(clientValue);
			System.out.println(stringToInteger + " sayısının Karekökü: " + Math.sqrt(stringToInteger));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
