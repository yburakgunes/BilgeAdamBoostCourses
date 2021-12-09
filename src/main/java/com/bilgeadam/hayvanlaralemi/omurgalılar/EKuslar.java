package com.bilgeadam.hayvanlaralemi.omurgalılar;

public enum EKuslar {
	PAPAGAN(1, "Papagan"), SERCE(2, "Serce"), MUHABBETKUSU(3, "MuhabbetKusu"), KARTAL(4, "Kartal"), ATMACA(5, "Atmaca");
	
	private final int id;
	private final String kusAdi;
	
	private EKuslar(int id, String kusAdi) {
		this.id = id;
		this.kusAdi = kusAdi;
	}
	
}
