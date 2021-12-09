package com.a.extras;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class JwtEncoderDecoder {
	// encode:�ifreleyici
	public static String encoderMethod() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("L�tfen yaz� giriniz");
		String value = klavye.nextLine();
		Encoder encoder = Base64.getEncoder();
		String toPassword = encoder.encodeToString(value.getBytes());
		System.out.println("�ifrelenmi� veri: " + toPassword);
		return toPassword;
	}
	
	// decode: �ifre ��z�c�
	public static String decoderMethod(String value) {
		Decoder decoder = Base64.getDecoder();
		String sifreCoz = new String(decoder.decode(value));
		System.out.println("�ifre ��z�m�: " + sifreCoz);
		return sifreCoz;
	}
	
	public static void main(String[] args) {
		//
		// monad
		decoderMethod(encoderMethod());
	}
}
