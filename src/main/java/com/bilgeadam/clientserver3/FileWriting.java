package com.bilgeadam.clientserver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class FileWriting {
	public static void main(String[] args) {
		
		FileWriting test1 = new FileWriting();
		
		test1.doMethod();
		
	}
	
	public int getCount() {
		
		int count = 0;
		try {
			if (!new File("d:\\myCount.txt").exists())
				return 1;
			else {
				BufferedReader br = new BufferedReader(new FileReader(new File("d:\\myCount.txt")));
				String s = br.readLine();
				count = Integer.parseInt(s);
				br.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public void putCount(int count) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("d:\\myCount.txt")));
			bw.write(Integer.toString(count));
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doMethod() {
		int count = getCount();
		System.out.println("You are running this program " + count + " number of times");
		count++;
		putCount(count);
	}
}