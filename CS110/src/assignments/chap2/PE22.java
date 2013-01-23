package assignments.chap2;

import java.util.Scanner;

public class PE22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius;
		double length;
		double area;
		double volume;
		double pi = Math.PI;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input the radius of the cylinder: ");
		
		radius = s.nextDouble();
		
		System.out.println("input the length of the cylinder: ");
		
		length = s.nextDouble();
		
		area = radius * radius * pi;
		
		volume = area * length;
		
		System.out.println("The volume of the cylinder is " + volume);
		

	}

}
