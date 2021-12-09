package com.bilgeadam.boost.javacourse01.lesson28;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataReaderExample {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\MSİ\\Desktop\\Naber\\values.ddd");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			
			while (true) {
				System.out.println(("--> ") + dis.readDouble());
				System.out.println(("--> ") + dis.readInt());
				
			}
			// dis.close();
		} catch (EOFException e) {
			System.out.println("Dosya tümüyle okundu");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// BufferedInputStream bis = new BufferedInputStream(fis);
		// DataInputStream dis = new DataInputStream(fis);
	}
}
