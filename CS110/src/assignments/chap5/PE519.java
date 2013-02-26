package assignments.chap5;

import java.util.Scanner;

public class PE519 {

	public static void main(String[] args) {
		double side1;
		double side2;
		double side3;
		boolean sidesValid;
		double area = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("What is the length of the first side? ");
		side1 = s.nextDouble();
		System.out.println("What is the length of the second side? ");
		side2 = s.nextDouble();
		System.out.println("What is the length of the third side? ");
		side3 = s.nextDouble();
		
		sidesValid = isValid(side1, side2, side3);
		if (sidesValid == true) {
			area = area(side1, side2, side3);
			System.out.println("The area of this triangle is " + area);
		}
		if (sidesValid == false)
			System.out.println("This is not a valid triangle.");
		

	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		boolean valid = false;
		if (side1 + side2 > side3){
			if (side2 + side3 > side1)
				if (side3 + side1 > side2)
					valid = true;
		}

		else
			valid = false;
		return valid;
		
	}
	
	public static double area(double side1, double side2, double side3) {
		double totalOverTwo = (side1 + side2 + side3)/2.0;
		return (Math.sqrt(totalOverTwo*(totalOverTwo-side1)*(totalOverTwo-side2)*(totalOverTwo-side3)));
		
	}

}
