package com.bilgeadam.clientserver.twoway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Yusuf {
	public static void main(String[] args) throws IOException {
		String receiveMessage;
		String sendMessage;
		
		PersonA person = new PersonA(2, "Burak", "Gunes");
		
		ServerSocket serverSocket = new ServerSocket(StaticPort.PORT);
		System.out.println("Server hazır...");
		Socket socket = serverSocket.accept();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = socket.getOutputStream();
		
		PrintWriter printWriter = new PrintWriter(outputStream, true);
		
		InputStream inputStream = socket.getInputStream();
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
		
		while (true) {
			if ((receiveMessage = receiveRead.readLine()) != null) {
				System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getId() + " "
						+ person.getLogDate() + " : " + receiveMessage);
//				Burak.writeText(receiveMessage);
			}
			
			sendMessage = bufferedReader.readLine();
			Burak.writeText(sendMessage);
			printWriter.println(sendMessage);
			printWriter.flush();
		}
		
	}
}
