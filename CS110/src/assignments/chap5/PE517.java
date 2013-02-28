package assignments.chap5;

import java.util.Scanner;

public class PE517 {

	public static void main(String[] args) {
		int input;
		Scanner s = new Scanner(System.in);
		System.out.println("How many rows and columns do you want in the matrix?");
		input = s.nextInt();
		System.out.println();
		printMatrix(input);
		
	}
	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++){
				double x = Math.random();
				int OneOrZero;
				if (x<.5)
					OneOrZero = 0;
				else
					OneOrZero = 1;
				System.out.print(OneOrZero + " ");
			}
			System.out.println();
		}
	}
}
