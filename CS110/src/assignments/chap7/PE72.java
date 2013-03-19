package assignments.chap7;

import java.util.Scanner;

public class PE72 {

	public static void main(String[] args) {
		
		double [][] m = new double[4][4];
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first row of a 4x4 matrix. ");

		for (int i = 0; i < m.length; i++){
			for (int j = 0; j < m[0].length; j++){
				m[i][j] = s.nextDouble();
			}
			System.out.println("Enter the next row. ");

		}
		double total = sumMajorDiagonal(m);

		System.out.println("The sum of the major diagonal is " + total);

	}
	
	public static double sumMajorDiagonal(double[][] m) {
		int rows = m.length;
		double total = 0;
		for (int i = 0; i < rows; i++){
			total = total + m[i][i];
		}
		return total;
	}

}
