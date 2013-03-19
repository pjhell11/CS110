package assignments.chap7;

import java.util.Scanner;

public class PE719 {
	
	public static void main(String[] args) {
		int[][] board = new int[6][7];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first row of the matrix.");
		String result = "False.";
		
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[0].length; j++){
				board[i][j] = s.nextInt();
			}
			
			System.out.println("Enter the next row of the matrix.");
			
		}
		
		for (int a = 0; a < board.length; a++) {
			for (int b = 0; b < board[0].length; b++) {
				if (b < 5 && board[a][b] == board[a][b+1] && board[a][b] == board[a][b+2] && board[a][b] == board[a][b+3])
					result = "True.";
				if (a < 4 && board[a][b] == board[a+1][b] && board[a][b] == board[a+2][b] && board[a][b] == board[a+3][b])
					result = "True.";
				if (b < 5 && a < 4 && board[a][b] == board[a+1][b+1] && board[a][b] == board[a+2][b+2] && board[a][b] == board[a+3][b+3])
					result = "True.";
				if (b > 3 && a < 4 && board[a][b] == board[a+1][b-1] && board[a][b] == board[a+2][b-2] && board[a][b] == board[a+3][b-3])
					result = "True.";
			}
		}
		System.out.println(result);
	}
	

}
