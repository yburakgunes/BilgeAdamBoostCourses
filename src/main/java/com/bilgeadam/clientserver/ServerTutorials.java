package com.bilgeadam.clientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTutorials {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		String clienttanGelenVeri;
		int clienttanGelenSayi;
		
		try {
			serverSocket = new ServerSocket(7777);
		} catch (Exception e) {
			System.out.println("Portta bir hata meydana geldi");
			e.printStackTrace();
		}
		System.out.println("Artik server'iniz hazir");
		clientSocket = serverSocket.accept();
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(System.in));
		
		while ((clienttanGelenVeri = in.readLine()) != null) {
			System.out.println("Clienttan gelen veri: " + clienttanGelenVeri);
			clienttanGelenSayi = Integer.valueOf(clienttanGelenVeri);
			out.println(Math.sqrt(clienttanGelenSayi));
		}
		
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
}
