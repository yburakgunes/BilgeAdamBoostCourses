package com.bilgeadam.boost.javacourse01.lesson42;

import java.util.HashMap;

public class MenuHelper {
	private static MenuHelper instance = null;
	private HashMap<Integer, String> menuItems;
	
	private MenuHelper() {
		super();
		this.menuItems = null;
	}
	
	public static MenuHelper getInstance() {
		if (instance == null) {
			instance = new MenuHelper();
		}
		
		return instance;
	}
	
	public HashMap<Integer, String> getMenuItems() throws Exception {
		if (this.menuItems == null)
			throw new Exception("Menu items not initialized");
		
		return this.menuItems;
	}
	
	public void setMenuItems(HashMap<Integer, String> menuItems) {
		this.menuItems = menuItems;
	}
	
}
