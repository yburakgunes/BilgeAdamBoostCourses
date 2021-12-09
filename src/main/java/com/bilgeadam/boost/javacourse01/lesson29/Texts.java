package com.bilgeadam.boost.javacourse01.lesson29;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class Texts {
	private Locale locale;
	private ArrayList<String> texts;
	
	public Texts(String language, String country) {
		this.locale = new Locale(language, country);
		this.texts = new ArrayList<String>();
		
	}
	
	public void readRawStrings() {
		File file = new File(
				"C:\\Users\\MSİ\\Desktop\\eclipse1\\eclipse\\eclipseworkspace\\BilgeAdamJava\\src\\main\\java\\com\\bilgeadam\\boost\\javacourse01\\lesson29\\config\\raw_texts_");
		try {
			FileReader fR = new FileReader(file);
			BufferedReader bR = new BufferedReader(fR);
			while(true) {
				String text = bR.readLine();
				if (text == null) {
					
				}
				this.texts.add(text);
			}
//			bR.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
