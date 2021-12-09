package com.bilgeadam.clientserverhw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TheClient {
	
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Usage <ip-address> <portNumber>");
			System.exit(-1);
		}
		
		String hostName = "";
		int port = 0;
		try {
			hostName = args[0];
			port = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.err.println("Usage <ip-address> <portNumber>");
			System.exit(-2);
		}
		
		try (Socket socket = new Socket(hostName, port)) {
			InputStream input = socket.getInputStream();
			OutputStream output = socket.getOutputStream();
			InputStreamReader reader = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(reader);
			PrintWriter writer = new PrintWriter(output, true);
			writer.println("Saat kaç?");
			System.out.println(br.readLine());
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
			System.exit(-3);
		}
	}
	
}
