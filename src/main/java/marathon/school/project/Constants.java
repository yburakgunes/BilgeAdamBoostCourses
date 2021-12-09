package marathon.school.project;

import java.time.format.DateTimeFormatter;

public class Constants {
	public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	public static final DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy");
	private static int count = 0;
	
	public void doMethod() {
		count++;
		
	}
}
