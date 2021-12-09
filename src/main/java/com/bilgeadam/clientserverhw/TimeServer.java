package com.bilgeadam.clientserverhw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("Usage : <portNumber>");
			System.exit(-1);
		}
		
		int port = 0;
		try {
			port = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.err.println("Usage : <portNumber>");
			System.exit(-2);
		}
		
		try (ServerSocket server = new ServerSocket(port)) {
			System.out.println("Timeserver sizi <<" + port + ">> numaralı porttan dinliyor");
			
			while (true) {
				Socket socket = server.accept();
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				InputStreamReader reader = new InputStreamReader(input);
				BufferedReader br = new BufferedReader(reader);
				PrintWriter writer = new PrintWriter(output, true);
				writer.println(LocalDateTime.now() + "--> " + br.readLine());
			}
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
			System.exit(-3);
		}
	}
	
}
