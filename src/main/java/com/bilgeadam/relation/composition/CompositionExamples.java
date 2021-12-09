package com.bilgeadam.relation.composition;

import java.util.ArrayList;

public class CompositionExamples {
	public static void main(String[] args) {
		// 1
		Avm avm = new Avm("Kanyon", "İstanbul");
		avm.setDukkanList(new ArrayList<Dukkan>());
		System.out.println(avm);
		System.out.println("****************");
		
		Dukkan dukkan = new Dukkan("Elektronik dukkan", "Beyaz eşya");
		dukkan.setAvm(avm);
		dukkan.getAvm().getDukkanList().add(dukkan);
		
		Dukkan dukkan2 = new Dukkan("Restaurant", "Kebap");
		dukkan.setAvm(avm);
		dukkan.getAvm().getDukkanList().add(dukkan2);
		
		Dukkan dukkan3 = new Dukkan("Oyuncakçi", "Star Wars karakterleri");
		dukkan.setAvm(avm);
		dukkan.getAvm().getDukkanList().add(dukkan3);
		
		for (Dukkan temp : avm.dukkanList) {
			System.out.println(temp);
		}
		
	}
}
