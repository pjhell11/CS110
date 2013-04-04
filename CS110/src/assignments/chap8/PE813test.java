package assignments.chap8;

import java.util.Scanner;

public class PE813test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of an array.");
		int rows = s.nextInt();
		int cols = s.nextInt();
		System.out.println("Enter the array.");
		double[][] matrix = new double[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = s.nextDouble();
			}
		}
		
		Location location = new Location(matrix);
		location.findMax();
	}
}
