package com.bilgeadam.clientserver.twoway;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Burak {
	
	public static final String FILE_PATH = "C:\\bilgeadam\\sohbet.txt";
	
	public static String writeText(String sohbet) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH,true))) {
			bufferedWriter.write(sohbet+"\n");
			bufferedWriter.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sohbet;
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		String receiveMessage;
		String sendMessage;
		
		PersonA person = new PersonA(1, "Yusuf", "Gunes");
		
		Socket socket = new Socket("localhost", StaticPort.PORT);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream, true);
		
		InputStream inputStream = socket.getInputStream();
		BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
		System.out.println("Lütfen mesaj yazınız");
		
		while (true) {
			
			sendMessage = bufferedReader.readLine();
			printWriter.println(sendMessage);
			writeText(person.getId() + " " + person.getFirstName() + " " + person.getLastName() + " " + person.getLogDate() + " : " + sendMessage);
			printWriter.flush();
			
			if ((receiveMessage = bufferedReader2.readLine()) != null) {
				
				System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getId() + " "
						+ person.getLogDate() + " : " + receiveMessage);
//				writeText(receiveMessage);
				
			}
		}
	}
}
