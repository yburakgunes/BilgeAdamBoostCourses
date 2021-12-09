package com.bilgeadam.a012.date;

public enum EGender {
	MAN("E"), WOMAN("K");
	
	private String gender;
	
	private EGender(String gender) {
		this.gender = gender;
	}
	
	public static EGender stringToGender(String str) {
		if (str.equalsIgnoreCase("E")) {
			
			return MAN;
		}
		
		else
			return WOMAN;
		
	}
}
