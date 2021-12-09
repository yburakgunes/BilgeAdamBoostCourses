package com.bilgeadam.boost.javacourse01.lesson31;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class SchoolManagementSystem {
	private static String FULL_PATH = "C:\\Users\\trs\\BilgeAdam\\Basic Concepts\\src\\com\\bilgeadam\\boost\\java\\school.dat";
	private static File schoolDataFile;
	private static String desiredLanguage;
	
	public static void main(String[] args) {


		SchoolManagementSystem.setDesiredLanguage(args);
		
		BAUtils.header(" O K S - Okul Yönetim Sistemi");
	
		SchoolManagement school;
		school = readSchoolData();
		HashMap<Integer, String> menu = school.initMenu();
		
		int selection = 0;
		boolean cont = true;
		do {
			selection = BAUtils.menu(menu);
			if (selection != 10) {
				school.processMenu(selection);
				cont = true;
			}
			else {
				cont = BAUtils.wantToEnd("Gerçekten (Evet/Hayır)?", "Evet");
				;
			}
		}
		while (cont);
		BAUtils.footer();
		writeSchoolData(school);
	}

	private static void setDesiredLanguage(String[] args) {
		if (args.length < 1) {
			SchoolManagementSystem.desiredLanguage = "tr";
		}
		else {
			SchoolManagementSystem.desiredLanguage = args[0];
		}
	}

	private static void writeSchoolData(SchoolManagement school) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SchoolManagementSystem.schoolDataFile));) {
            oos.writeObject(school);
		}
		catch (FileNotFoundException ex) {
			System.err.println("Cannot find <<school.data>>-File at \'" + SchoolManagementSystem.FULL_PATH + "\'. Due: " + ex.getMessage());
		}
		catch (IOException ex) {
			System.err.println("Cannot write <<school.data>>-File at \'" + SchoolManagementSystem.FULL_PATH + "\'. Due: " + ex.getMessage());
		}
	}

	private static SchoolManagement readSchoolData() {
		SchoolManagement school = new SchoolManagement();
		if (canFindSchoolData()) {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SchoolManagementSystem.schoolDataFile));) {
	            System.out.println("School data file found - reading data from there");
	            school = (SchoolManagement)ois.readObject();
	      }
	      catch(Exception e){
	            System.err.println("Cannot read <<school.data>>-File at \'" + SchoolManagementSystem.FULL_PATH + "\'. Due: " + e.getMessage());
	      }
		}
		return school;
	}

	private static boolean canFindSchoolData() {
		SchoolManagementSystem.schoolDataFile = new File(SchoolManagementSystem.FULL_PATH);
		return SchoolManagementSystem.schoolDataFile.exists();
	}

	public static String getDesiredLanguage() {
		
		return SchoolManagementSystem.desiredLanguage;
	}
}
