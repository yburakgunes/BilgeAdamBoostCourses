package com.bilgeadam.clientserverhw;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Base64;
import java.util.Base64.Encoder;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class ClientSide {
	public static void main(String[] args) {
		
		IpAndPort ipAndPort = new IpAndPort("localhost", 4711);
		
		Info info = new Info(BAUtils.readString("Lütfen Adınızı giriniz"),
				BAUtils.readString("Lütfen Soyadınızı giriniz"), BAUtils.readString("Lütfen Şifrenizi giriniz"));
		String encodedPassword = Encoder(info.getPassword());
		Info info2 = new Info(info.getFirstName(), info.getLastName(), encodedPassword);
		
		try (Socket socket = new Socket(ipAndPort.getIp(), ipAndPort.getPort())) {
			InputStream input = socket.getInputStream();
			OutputStream output = socket.getOutputStream();
			InputStreamReader reader = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(reader);
			PrintWriter writer = new PrintWriter(output, true);
			writer.println(info2.getFirstName());
			writer.println(info2.getLastName());
			writer.println(info2.getPassword());
			System.out.println(br.readLine());
			String incomingPass = br.readLine().trim();
			System.out.println("Burası Client dostlar  " + incomingPass);
			// System.out.println(info.getPassword());
			if (incomingPass.equals(info.getPassword())) {
				System.out.println("Şifreler eşleşti");
			} else {
				System.out.println("Şifreler aynı değil");
			}
			
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
			System.exit(-3);
		}
	}
	
	private static String Encoder(String password) {
		
		byte[] encodedBytes = Base64.getEncoder().encode(password.getBytes());
		return new String(encodedBytes);
		
	}
}