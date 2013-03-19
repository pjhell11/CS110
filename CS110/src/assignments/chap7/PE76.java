package assignments.chap7;

public class PE76 {

	public static void main(String[] args) {
		double[][] matrixA = {{1,2,3}, {4,5,6}, {7,8,9}};
		double[][] matrixB = {{0,2,4},{1,4.5,2.2},{1.1,4.3,5.2}};
		double[][] matrixC = multiplyMatrix(matrixA, matrixB);
		System.out.println("The multiplication of the matrices is");
		for (int i = 0; i < matrixC.length; i++){
			System.out.println();
			for (int j = 0; j < matrixC[0].length; j++){
				System.out.printf("%.2f", matrixC[i][j]);
				System.out.print("  ");
				
			}
		}
		
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] c = new double[3][3];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[0].length; j++){
				c[i][j] = a[i][j] * b[i][j];
				//System.out.println(c[i][j]);
			}
		}
		return c;
	}

}
