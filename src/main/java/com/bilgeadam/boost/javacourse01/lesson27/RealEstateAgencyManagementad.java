package com.bilgeadam.boost.javacourse01.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class RealEstateAgencyManagementad {
	
	public static void main(String[] args) {
		
		Address agencyAddr = new Address("Balık Sokak", "Istanbul", "Turkey", 15);
		
		RealEstateAgency agency = new RealEstateAgency("Konut Realty", agencyAddr);
		
		Address landAddr = new Address("İnonü Caddesi", "Istanbul", "Turkey", 15);
		Dimension landDim = new Dimension(100.0, 200.0);
		Land land1 = new Land("Pazaryeri", landAddr, landDim, LocalDate.now(), 200000.0);
		
		agency.addRealty(land1);
		
		House house1 = new House("Bilge Apartmanı", new Address("Mustafa Caddesi", "Istanbul", "Turkey", 45),
				new Dimension(10.0, 10.5), LocalDate.parse("2021-10-15"));
		house1.setLevelNumber(3);
		house1.setNumOfRooms(3);
		house1.setPrice(2000.0);
		agency.addRealty(house1);
		
		serializeAgency(agency);
		RealEstateAgency myNewAgency = deserializeAgency();
		
		House house2 = new House("Adam Apartmanı", new Address("Mustafa Caddesi", "Istanbul", "Turkey", 5),
				
				new Dimension(10.0, 10.5), LocalDate.parse("2021-11-15"));
		System.out.println(myNewAgency);
		myNewAgency.addRealty(house2);
		
		System.out.println(myNewAgency);
	}
	
	private static void serializeAgency(RealEstateAgency agency) {
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\MSİ\\Desktop\\Naber\\agency.data");
			ObjectOutputStream oos = new ObjectOutputStream(file);
			oos.writeObject(agency);
			oos.close();
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private static RealEstateAgency deserializeAgency() {
		RealEstateAgency agency = null;
		try {
			File ff = new File ("C:\\Users\\MSİ\\Desktop\\Naber\\agency.data");
			FileInputStream file = new FileInputStream("C:\\Users\\MSİ\\Desktop\\Naber\\agency.data");
			ObjectInputStream ois = new ObjectInputStream(file);
			agency = (RealEstateAgency) ois.readObject();
			ois.close();
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return agency;
		
	}
	
}
