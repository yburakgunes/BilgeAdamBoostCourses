package com.bilgeadam.compositionavm;

import java.util.ArrayList;

public class AvmMain {
	public static void main(String[] args) {
		Avm avm = new Avm("14.10.2021", 22, "Kanyon", 2005, "Levent");
		avm.setStore(new ArrayList<Store>());
		
		Store store = new Store("10.11.2021", 14, "Zara", "V Yaka Bluz", 129.90);
		store.setAvm(avm);
		store.getAvm().getStore().add(store);
		
		Store store2 = new Store("13.11.2021", 17, "Mango", "Etek", 239.90);
		store.setAvm(avm);
		store.getAvm().getStore().add(store2);
		
		Store store3 = new Store("16.11.2021", 18, "H&M", "Stiletto", 599.90);
		store.setAvm(avm);
		store.getAvm().getStore().add(store3);
		
		for (Store temp : avm.storeList) {
			System.out.println(temp);
		}
		
		
	}
}
