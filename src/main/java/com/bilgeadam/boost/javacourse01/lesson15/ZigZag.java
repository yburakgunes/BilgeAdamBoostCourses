package com.bilgeadam.boost.javacourse01.lesson15;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class ZigZag {
	
	public static void main(String[] args) {
		String str = "BaBoostJava";
		int rowNumber = 3;
		ZigZag zag = new ZigZag();
		BAUtils.header("ZIGZAG Example");
		String result = zag.convert(str, rowNumber);
		System.out.println(result);
		BAUtils.footer();
	}
	
	private String convert(String str, int rowNumber) {
		String retVal = "";
		
		return retVal;
	}
	
}
