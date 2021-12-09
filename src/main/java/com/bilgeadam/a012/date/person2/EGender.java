package com.bilgeadam.a012.date.person2;

public enum EGender {
	
	Bayan(1, "Bayan"), Bay(2, "Erkek");
	
	private final int id;
	private final String gender;
	
	private EGender(int id, String gender) {
		this.id = id;
		this.gender = gender;
		
	}
}
