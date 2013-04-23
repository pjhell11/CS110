package assignments.chap11;

import java.util.Scanner;

public class TriangleTest {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first side length of a triangle. ");
		double side1 = s.nextDouble();
		System.out.println("Enter the second side length of the triangle. ");
		double side2 = s.nextDouble();
		System.out.println("Enter the third side length of the triangle. ");
		double side3 = s.nextDouble();
		
		System.out.println("Enter the color of the triangle. ");
		String color = s.next();
		
		System.out.println("Is the triangle filled? (true/false)");
		boolean filled = s.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		System.out.println("The perimeter of this triangle is " + triangle.getPerimeter() +
				"\nand the area is " + triangle.getArea() + ". The color is " + triangle.getColor() +
				"\nand it is " + triangle.isFilled() + " that the traingle is filled.");
	}

}
