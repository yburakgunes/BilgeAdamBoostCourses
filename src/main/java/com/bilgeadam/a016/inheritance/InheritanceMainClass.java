package com.bilgeadam.a016.inheritance;

public class InheritanceMainClass {
	
	public static void main(String[] args) {
		MsiComputer msiComputer = new MsiComputer();
		msiComputer.setComputerName("Msi");
		msiComputer.setComputerMainBoard("Msi main cart");
		msiComputer.deneme(); // polymophism
		msiComputer.setMsiSensor("Msi Sensor");
		System.out.println(msiComputer);
		
		System.out.println("////////////////////////////////////////");
		
		AsusComputer asusComputer = new AsusComputer();
		asusComputer.setComputerName("Asus");
		asusComputer.setComputerMainBoard("Asus main cart");
		System.out.println(asusComputer);
		asusComputer.deneme(); // polymophism
		
		System.out.println("////////////////////////////////////////");
		
		MonsterComputer monsterComputer = new MonsterComputer();
		monsterComputer.setComputerName("Monster");
		monsterComputer.setComputerMainBoard("Monster main cart");
		System.out.println(monsterComputer);
		monsterComputer.deneme(); // polymophism
		
		System.out.println("////////////////////////////////////////");
	}
	
}
