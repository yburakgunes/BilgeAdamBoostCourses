package com.bilgeadam.boost.javacourse01.lesson33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class TranslationServer {
	public static void main(String[] args) {
		int port = 4711;
		try (ServerSocket server = new ServerSocket(port)) {
			System.out.println("Server waiting...");
			Socket socket = server.accept();
			System.out.println("Client connection established");
			processRequest(socket);
			
		} catch (IOException e) {
			System.out.println("Birşeyler çok kötü gitti: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	private static void processRequest(Socket socket) throws IOException {
		while (true) {
			RequestInfo request = getDataFromClient(socket);
			String processed = processData(request);
			sendDatatoClient(socket, processed);
		}
	}
	
	private static void sendDatatoClient(Socket socket, String processed) throws IOException {
		OutputStream output = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(output, true);
		
		writer.println(processed);
	}
	
	private static String processData(RequestInfo request) {
		ResourceBundle rB = ResourceBundle.getBundle("com.bilgeadam.boost.javacourse01.lesson33.TranslationText",
				new Locale(request.language));
		return rB.getString(request.translationKey);
	}
	
	private static RequestInfo getDataFromClient(Socket socket) throws IOException {
		InputStream input = socket.getInputStream();
		InputStreamReader reader = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(reader);
		
		String textToTranslate = br.readLine();
		String key = br.readLine();
		String translateInto = br.readLine();
		
		// String inputLine;
		// String retVal = "";
		// while ((inputLine = br.readLine()) != null) {
		// retVal += inputLine;
		// }
		
		br.close();
		return new RequestInfo(textToTranslate, key, translateInto);
	}
}
