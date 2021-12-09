package marathon.school.project;


public enum EGenderSchool {
	ERKEK("Erkek"), KADIN("Kadın");
	
	String gender;
	
	private EGenderSchool(String gender) {
		this.gender = gender;
	}
	
	public static EGenderSchool stringToGender(String str) {
		if (str.equalsIgnoreCase("E")) {
			
			return ERKEK;
		}
		
		else
			return KADIN;
		
	}
}
