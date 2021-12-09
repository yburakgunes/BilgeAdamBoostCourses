package com.bilgeadam.boost.javacourse01.lesson28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\MSİ\\Desktop\\Naber\\mektup.txt");
		if (file.exists()) {
			System.out.println("Mektup belgesi zaten var");
		} else {
			System.out.println("Mektup belgesi henüz yok");
			
		}
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bR = new BufferedReader(reader);
			while (true) {
				String line = bR.readLine();
				if (line == null) {
					break;
				}
				System.out.println("-->" + line);
			}
			bR.close();
		}
		// catch (FileNotFoundException ex) {
		//
		// ex.printStackTrace();
		// }
		catch (IOException ex) {
			
			ex.printStackTrace();
		}
		
	}
	
}
