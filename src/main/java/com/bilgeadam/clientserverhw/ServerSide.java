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
import java.util.Base64;

public class ServerSide {
	
	public static void main(String[] args) {
		IpAndPort serverPort = new IpAndPort(4711);
		
		try (ServerSocket server = new ServerSocket(serverPort.getPort())) {
			System.out.println("Timeserver sizi <<" + serverPort.getPort() + ">> numaralı porttan dinliyor");
			
			while (true) {
				Socket socket = server.accept();
				
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				InputStreamReader reader = new InputStreamReader(input);
				BufferedReader br = new BufferedReader(reader);
				
				Info info3 = new Info(br.readLine(), br.readLine(), br.readLine());
				String decodedPassword = decoder(info3.getPassword());
				info3.setFirstName(info3.getFirstName().toUpperCase());
				info3.setLastName(info3.getLastName().toUpperCase());
				info3.setPassword(decodedPassword);
				
				PrintWriter writer = new PrintWriter(output, true);
				writer.println("Adınız Soyadınız-->" + info3.getFirstName() + " " + info3.getLastName());
				writer.println(info3.getPassword());
			}
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
			System.exit(-3);
		}
	}
	
	private static String decoder(String password) {
		
		byte[] decodedBytes = Base64.getDecoder().decode(password);
		return new String(decodedBytes);
		
	}
}
