package assignments.chap7;

public class PE74 {

	public static void main(String[] args) {
		int emp = 8;
		int days = 7;
		int[][] m = {{2,4,3,4,5,8,8,0},{7,3,4,3,3,4,4,0},{3,3,4,3,3,2,2,0},
				{9,3,4,7,3,4,1,0},{3,5,4,3,6,3,8,0},{3,4,4,6,3,4,4,0},
				{3,7,4,8,3,8,4,0},{6,3,5,9,2,7,9,0}};
		
		for (int i = 0; i < emp; i++){
			int total = 0;
			System.out.printf("%12s", "Employee " + i);
			for (int j = 0; j < days; j++) {
				System.out.printf("%3s", m[i][j]);
				total = total + m[i][j];
			}
			m[i][8] = total;
			System.out.println();
		}


	}

}
