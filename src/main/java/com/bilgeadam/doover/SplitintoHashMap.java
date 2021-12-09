package com.bilgeadam.doover;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SplitintoHashMap {
	public static void main(String[] args) {
		String str = "key1=value1 key2=value2 key3=value3";
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		String[] str2 = str.split(" ");
		
//		for (String abc : str2) {
//			System.out.println(str2);
//			
//		}
		
		
		for (int i = 0; i < str2.length; i++) {
			
			String retVal = str2[i];
			
			String [] abc = retVal.split("=");
			
			String key = abc[0];
			String value = abc [1];
			
			hmap.put(key, value);
			
		}
		
		for (Map.Entry<String, String> abc : hmap.entrySet()) {
			System.out.println("----------KEY MİSİN SENNNN ---------" +abc.getKey() +"----------VALUE MUSUN SENNNN ---------" +abc.getValue());
			
		}
		
		System.out.println(Arrays.asList(hmap));
		System.out.println(Collections.singletonList(hmap));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		
//		for (int i = 0; i < str2.length; i++) {
//			
//			String data = str2[i];
//			
//			String[] data2 = data.split("=");
//			
//			hmap.put(data2[0], data2[1]);
//			
//		}
//		
//		System.out.println(hmap.get("key1") + hmap.get("key2") + hmap.get("key3"));
//		
//		for (Map.Entry<String, String> hmap2 : hmap.entrySet()) {
//			System.out.println(hmap2.getKey() + " " + hmap2.getValue());
//			
//		}
//		
//		System.out.println(Arrays.asList(hmap));
//		
//		
	}
}
