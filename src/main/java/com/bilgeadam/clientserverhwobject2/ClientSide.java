package com.bilgeadam.clientserverhwobject2;

import com.bilgeadam.boost.java.course01.util.BAUtils;

import java.io.*;
import java.net.Socket;
import java.util.Base64;

public class ClientSide {
	public static void main(String[] args) {
		BAUtils.header("Burak");
		PortAndIpClass portAndIp = new PortAndIpClass(4711, "localhost");
		Info info = new Info(BAUtils.readString("Lütfen Adınızı Giriniz"),
				BAUtils.readString("Lütfen Soyadınızı Giriniz"), BAUtils.readString("Lütfen Şifrenizi Giriniz"));
		String encodedPassword = jwtEncoder(info.getPassword());
		Info info2 = new Info(info.getName(), info.getSurname(), encodedPassword);
		
		try (Socket socket = new Socket(portAndIp.getIp(), portAndIp.getPort())) {
			OutputStream output = socket.getOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(output);
			objectOutputStream.writeObject(info2);
			/*
			 * InputStreamReader reader = new InputStreamReader(input);
			 * BufferedReader br = new BufferedReader(reader);
			 * PrintWriter writer = new PrintWriter(output, true);
			 * writer.println(info2.getName());
			 * writer.println(info2.getSurname());
			 * writer.println(info2.getPassword());
			 * System.out.println(br.readLine());
			 * String incomingPass = br.readLine().trim();
			 */
			InputStream input = socket.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(input);
			info2 = (Info) objectInputStream.readObject();
			System.out.println(info2);
			String incomingPass = info2.getPassword();
			
			/*
			 * System.out.println(incomingPass);
			 * System.out.println(info.getPassword());
			 */
			if (incomingPass.equals(info.getPassword()))
				System.out.println("Şifreler eşleşti");
			else
				System.out.println("Şifreler Hatalı");
			
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getLocalizedMessage());
			System.exit(-3);
		}
	}
	
	private static String jwtEncoder(String password) {
		byte[] encodedBytes = Base64.getEncoder().encode(password.getBytes());
		return new String(encodedBytes);
	}
}
