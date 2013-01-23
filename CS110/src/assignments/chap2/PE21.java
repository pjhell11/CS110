package assignments.chap2;

import java.util.Scanner;

public class PE21 {
	public static void main (String[] args) {
		double fahrenheit;
		double celsius;
		Scanner s = new Scanner(System.in);

		System.out.println("Input celsius value: ");
		
		celsius = s.nextDouble();
		fahrenheit = (9.0/5) * celsius + 32.0;
		System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit.");
		
	}

}
