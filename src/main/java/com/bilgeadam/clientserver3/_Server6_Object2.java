package com.bilgeadam.clientserver3;

import java.util.ArrayList;
import java.util.List;

// Sehir diye bir class�m�z olsun
// id
// �ehirAdi

// clientta �imdki vereceklerimi eklememiz gerekiyor.
/*
 * �stanbul,Ankara,�zmir,Adana,Ad�yaman,Afyonkarahisar,A�r�,Aksaray,Amasya,
 * Antalya,Ardahan,Artvin,Aydın,Balıkesir,Bartın,Batman,Bayburt,Bilecik,Bingöl,
 * Bitlis,Bolu,Burdur,Bursa,Çanakkale,Çankırı,Çorum,Denizli,Diyarbakır,Düzce,
 * Edirne,Elazığ,Erzincan,Erzurum,Eskişehir,Gaziantep,Giresun,Gümüşhane,Hakkari,
 * Hatay,Iğdır,Isparta,Kahramanmaraş,Karabük,Karaman,Kars,Kastamonu,Kayseri,
 * Kırıkkale,Kırklareli,Kırşehir,Kilis,Kocaeli,Konya,K�tahya,Malatya,Manisa,
 * Mardin,Mersin,Muğla,Muş,Nevşehir,Niğde,Ordu,Osmaniye,Rize,Sakarya,Samsun,
 * Siirt,Sinop,Sivas,Şırnak,Tekirdağ,Tokat,Trabzon,Tunceli,Şanlıurfa,Uşak,Van,
 * Yalova,Yozgat,Zonguldak
 */

// StringTokenizer ile virg�lle par�al�yal�m
// para�alanm�� verileri d�ng� i�inde List ekliyelim
public class _Server6_Object2 {
	
	public static void main(String[] args) {
		// List<StudentObject> list = new ArrayList<StudentObject>();
		// list.add(new StudentObject(0, null));
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		list.forEach(System.out::println);
	}
	
}
