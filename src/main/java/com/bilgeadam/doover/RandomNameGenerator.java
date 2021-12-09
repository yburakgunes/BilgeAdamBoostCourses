package com.bilgeadam.doover;

import java.util.Random;

public class RandomNameGenerator {
	
	public String generateRandomName(int len) {
		String ch ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder builder = new StringBuilder(len);
//		int len = rnd.nextInt(5)+5;
		for (int i = 0; i < len; i++)
			builder.append(ch.charAt(rnd.nextInt(ch.length())));
		return builder.toString();
	}
	
	public static void main(String[] args) {
		RandomNameGenerator a = new RandomNameGenerator();
		System.out.println(a.generateRandomName(11));
	}
}
