package assignments.chap8;

import java.util.Scanner;

public class PE812test {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the endpoints of the first line (x1 y1 x2 y2)");
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();

		System.out.println("Enter the endpoints of the second line (x3 y3 x4 y4)");
		double x3 = s.nextDouble();
		double y3 = s.nextDouble();
		double x4 = s.nextDouble();
		double y4 = s.nextDouble();
		
		GeometryIntersection geoInt = new GeometryIntersection(x1, x2, x3, x4, y1, y2, y3, y4);
		
		geoInt.findPoint();
	}
}