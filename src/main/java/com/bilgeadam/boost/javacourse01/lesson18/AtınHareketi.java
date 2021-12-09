package com.bilgeadam.boost.javacourse01.lesson18;

import com.bilgeadam.boost.java.course01.util.BAUtils;

public class AtınHareketi {
	
	public static void main(String[] args) {
		BAUtils.header("Atın Hareketleri");
		
		do {
			String[][] board = printBoard();
			Position position = readPosition();
			
		} while (BAUtils.wantToEnd("Devam etmek ister misiniz?", "Hayır"));
		BAUtils.footer();
		
	}
	
	private static Position readPosition() {
		Position retVal = new Position();
		boolean uncorrectInput;
		do {
			uncorrectInput = false;
			String inp = BAUtils.readString("Atın pozisyonunu e4 gibi giriniz: ");
			char ch = inp.toLowerCase().charAt(0);
			int i = inp.charAt(1) - '0';
			if (!(ch < 'a' || ch > 'h')) {
				uncorrectInput = true;
				
			}
			if (!(i < 0 || i > 7)) {
				uncorrectInput = uncorrectInput && true;
			}
			retVal.x = ch;
			retVal.y = i;
		} while (!uncorrectInput);
		return retVal;
	}
	
	private static String[][] printBoard() {
		String[][] board = new String[8][8];
		for (int i = 8; i > 0; i--) {
			for (char c = 'a'; c <= 'h'; c++) {
				board[c - 'a'][i - 1] = (char) c + "" + i;
				System.out.print(board[c - 'a'][i - 1] + " ");
			}
			System.out.println();
			
		}
		return board;
	}
	
}
