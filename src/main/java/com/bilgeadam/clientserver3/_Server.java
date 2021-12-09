package com.bilgeadam.clientserver3;

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
		String upperCaseName;
		String lowerCaseName;
		int stringLength;
		
		
		System.out.println("Server hazır ");
		// veri alacağım
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			upperCaseName = clientValue.toUpperCase();
			lowerCaseName = clientValue.toLowerCase();
			stringLength= clientValue.length();
			System.out.println("Büyük harfli isminiz: " + upperCaseName + " Küçük harfli isminiz: " + lowerCaseName + " İsminizin uzunluğu: " + stringLength);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
