package com.bilgeadam.clientserver3;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class _Server6_Object {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			ServerSocket serverSocket = new ServerSocket(5555);
			System.out.println("Server çalışmaya hazır");
			
			Socket socket = serverSocket.accept();
			System.out.println("Bağlantı: " + socket);
			
			InputStream inputStream = socket.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			
			List<StudentObject> list = (List<StudentObject>) objectInputStream.readObject();
			
			// stream()
			
			list.forEach((temp) -> System.out.println(temp.getId() + " " + temp.getStudentName()));
			
			serverSocket.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
