package com.bilgeadam.main.examples;

import java.util.Scanner;

/*
 * 80<=hiz<=85 ==>H�zl� gidiyorsunuz l�tfen yava�lay�n�z: 200TL erken �derseniz
 * % 15 indirim alacaks�n�z.
 * 85<=hiz<=100 ==>�ok h�zl� gidiyorsunuz l�tfen yava�lay�n: 300 TL %15 indirim
 * 100<=h�z ==> Ehliyetinize el konuldu.1000 TL
 */

public class Examples_004_Radar {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("L�tfen h�z giriniz: ");
		int hiz = klavye.nextInt();
		double para = 0;
		if ((80 <= hiz) && (hiz <= 85)) {
			System.out.println("H�zl� gidiyorsunuz l�tfen yava�lay�n");
			para = 200;
			para = para - (para * (15.0 / 100.0));
			System.out.println("Cezan�z: 200 TL e�er erken �derseniz %15 indirim alacaks�n�z ");
		} else if ((85 < hiz) && (hiz <= 100)) {
			System.out.println("�ok h�zl� gidiyorsunuz l�tfen yava�lay�n");
			para = 300;
			para = para - (para * (15.0 / 100.0));
			System.out.println("Cezan�z: 300 TL e�er erken �derseniz %15 indirim alacaks�n�z ");
		} else if (hiz > 100) {
			System.out.println("h�z�n�z: " + hiz + "ehliyetinize el konulacakt�r");
			para = 1000;
			System.out.println("Cezan�z: 1000 TL e�er erken �derseniz %15 indirim alacaks�n�z ");
		}
		klavye.close();
	}
	
}
