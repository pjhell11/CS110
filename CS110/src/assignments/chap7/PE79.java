package assignments.chap7;

import java.util.Scanner;

public class PE79 {

	public static void main(String[] args) {
		String[][] board = {{" "," "," "},{" "," "," "},{" "," "," "}};
		printBoard(board);
		int numSpaces = 9;
		int i = 1;
		Scanner s = new Scanner(System.in);
		while (i < numSpaces) {
			System.out.println("Enter a row (0, 1, or 2) for player X");
			int rx = s.nextInt();
			System.out.println("Enter a column (0, 1, or 2) for player X");
			int cx = s.nextInt();
			if (board[rx][cx] == " ") {
				board[rx][cx] = "X";
				i = i + 1;
			}
			else
				System.out.println("Illegal placement. Turn skipped.");
			printBoard(board);
			
			if (checkWin(board) == true) {
				System.out.println("Player X wins!");
				i = 9;
			}
			
			System.out.println("Enter a row (0, 1, or 2) for player O");
			int ro = s.nextInt();
			System.out.println("Enter a column (0, 1, or 2) for player O");
			int co = s.nextInt();
			if (board[ro][co] == " ") {
				board[ro][co] = "O";
				i = i + 1;
			}
			else
				System.out.println("Illegal placement. Turn skipped.");
			printBoard(board);
			
			if (checkWin(board) == true) {
				System.out.println("Player O wins!");
				i = 9;
			}
		}

	}
	public static void printBoard(String[][] board) {
		System.out.println("-------------");
		System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
		System.out.println("-------------");
		System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
		System.out.println("-------------");
	}
	
	public static Boolean checkWin(String[][] board) {
		Boolean win = false;
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != " ")
			win = true;
		if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != " ")
			win = true;
		if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != " ")
			win = true;
		if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != " ")
			win = true;
		if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != " ")
			win = true;
		if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != " ")
			win = true;
		if (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != " ")
			win = true;
		if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != " ")
			win = true;
		return win;
	}

}
