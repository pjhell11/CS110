package assignments.chap8;

public class Location {
	
	public int row = 0;
	public int col = 0;
	public double maxValue = 0;
	double[][] matrix;
	
	public Location(double[][] matrix) {
		this.matrix = matrix;
	}
	
	public void findMax() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > maxValue){
					maxValue = matrix[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println("The maximum is " + maxValue + " found at (" + row + "," + col + ")");
	}
}
