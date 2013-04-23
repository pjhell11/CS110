package assignments.chap11;

import java.util.Scanner;

public class MyStackTest {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int numberOfStrings = 5;
		
		MyStack stack = new MyStack();
		
		System.out.println("Enter " + numberOfStrings + " strings to be displayed in reverse order.");
		
		for (int i = 0; i < numberOfStrings; i++) {
			stack.push(s.nextLine());
		}
		
		System.out.println(stack.getSize() + " strings in reverse are: ");
		
		for (int j = 0; j < numberOfStrings; j++) {
			System.out.println(stack.pop());
		}
	}
}
