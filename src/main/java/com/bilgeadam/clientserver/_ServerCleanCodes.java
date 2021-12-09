package com.bilgeadam.clientserver;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class _ServerCleanCodes {
	public static void main(String[] args) {
		String clientValue;
		int scannerNumber;
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(7777).accept().getInputStream())) {
			clientValue = dataInputStream.readUTF();
			scannerNumber = Integer.valueOf(clientValue);
			System.out.println(scannerNumber + " sayısının  Karekökü: " + Math.sqrt(scannerNumber));
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}