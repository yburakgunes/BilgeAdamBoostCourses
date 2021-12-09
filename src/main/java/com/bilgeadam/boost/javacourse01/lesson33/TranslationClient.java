package com.bilgeadam.boost.javacourse01.lesson33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

public class TranslationClient {
	public static void main(String[] args) {
		
		HashMap<String, String> texts = new HashMap<>();
		ResourceBundle rB = ResourceBundle.getBundle("com.bilgeadam.boost.javacourse01.lesson33.TranslationText");
		Enumeration<String> keys = rB.getKeys();
		
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			texts.put(rB.getString(key), key);
		}
		
		try (Socket socket = new Socket("localhost", 4711)) {
			
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				writer.println(rB.getString(key));
				writer.println(texts.get(key));
				writer.println("EN");
				System.out.println(br.readLine());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
