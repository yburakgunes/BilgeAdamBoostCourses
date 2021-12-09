package com.bilgeadam.clientserver3;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class _Client5_Object {
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost", 5555);
			System.out.println("Bağlantı tamamlandı");
			OutputStream outputStream = socket.getOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			
			List<StudentObject> objectList = new ArrayList<StudentObject>();
			objectList.add(new StudentObject(1, "Burak"));
			objectList.add(new StudentObject(2, "Burak2"));
			objectList.add(new StudentObject(3, "Burak3"));
			objectList.add(new StudentObject(4, "Burak4"));
			objectList.add(new StudentObject(5, "Burak5"));
			
			objectOutputStream.writeObject(objectList);
			
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
