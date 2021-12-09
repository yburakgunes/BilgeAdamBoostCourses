package com.bilgeadam.a016.inheritance;

// kalıtım:
// bütün bilgisayarlardaki ortak özellikler
//

public class Computer {
	
	// özellikler
	private String computerName = "";
	private String computerSerialNumber = "";
	private String computerMainBoard = "";
	
	// parametresiz constructor
	public Computer() {
//		this.computerMainBoard = "Lütfen anakart adı giriniz.";
//		this.computerName = "Lütfen bilgisayar adı giriniz.";
//		this.computerSerialNumber = "Lütfen seri numarasını giriniz.";
	}
	
	// parametreli constructor
	public Computer(String computerName, String computerSerialNumber, String computerMainBoard) {
		
		this.computerName = computerName;
		this.computerSerialNumber = computerSerialNumber;
		this.computerMainBoard = computerMainBoard;
	}
	
	// to String
	@Override
	public String toString() {
		return "Computer [computerName=" + computerName + ", computerSerialNumber=" + computerSerialNumber
				+ ", computerMainBoard=" + computerMainBoard + "]";
	}
	
	// method
	
	public void deneme() {
		System.out.println(this.computerSerialNumber.concat(" .XLS"));
	}
	
	// getter and setter
	
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	public String getComputerSerialNumber() {
		return computerSerialNumber;
	}
	
	public void setComputerSerialNumber(String computerSerialNumber) {
		this.computerSerialNumber = computerSerialNumber;
	}
	
	public String getComputerMainBoard() {
		return computerMainBoard;
	}
	
	public void setComputerMainBoard(String computerMainBoard) {
		this.computerMainBoard = computerMainBoard;
	}
	
}
