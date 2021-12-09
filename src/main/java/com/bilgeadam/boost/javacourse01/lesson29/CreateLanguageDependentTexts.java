package com.bilgeadam.boost.javacourse01.lesson29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CreateLanguageDependentTexts {
	
	public static void main(String[] args) {
		File configFile = new File(
				"C:\\Users\\MSİ\\Desktop\\eclipse1\\eclipse\\eclipseworkspace\\BilgeAdamJava\\src\\main\\java\\com\\bilgeadam\\boost\\javacourse01\\lesson29\\config");
		Texts texts;
		try {
			FileReader fR = new FileReader(configFile);
			BufferedReader bR = new BufferedReader(fR);
			String language = bR.readLine();
			System.out.println(language);
			String country = bR.readLine();
			System.out.println(country);
			int vat = Integer.parseInt(bR.readLine());
			System.out.println(vat);
			texts = new Texts(language, country);
			
			bR.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
//		texts.readRawStrings();
	}
	
}
