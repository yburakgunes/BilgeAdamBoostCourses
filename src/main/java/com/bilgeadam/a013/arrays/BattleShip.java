package com.bilgeadam.a013.arrays;

public class BattleShip {
	
	public static void main(String[] args) {
		char[][] battleArea = new char[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				battleArea[i][j] = ' ';
			}
		}
		
		battleArea[3][2] = 'A';
		battleArea[3][3] = 'A';
		battleArea[3][4] = 'A';
		printArea(battleArea);
	}
	
	private static void printArea(char[][] area) {
		System.out.println("---------------------");
		for (int i = 0; i < 10; i++) {
			String row = "|";
			for (int j = 0; j < 10; j++) {
				row += area[i][j] + "|";
			}
			
			System.out.println(row);
			System.out.println("---------------------");
			
		}
		System.out.println("---------------------");
		
	}
	
}
