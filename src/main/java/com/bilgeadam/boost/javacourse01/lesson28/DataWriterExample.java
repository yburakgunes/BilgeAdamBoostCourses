package com.bilgeadam.boost.javacourse01.lesson28;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWriterExample {
	
	public static void main(String[] args) {
		double[] values = { 1.12, 22.45, 643.0, 999.9 };
		int[] ints = { 1, 23, 643, 9843 };
		File file = new File("C:\\Users\\MSİ\\Desktop\\Naber\\values.ddd");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			for (int i = 0; i < values.length; i++) {
				dos.writeInt(ints);
				dos.writeDouble(values[i]);
			}
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
