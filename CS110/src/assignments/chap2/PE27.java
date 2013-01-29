package assignments.chap2;

import java.util.Scanner;

public class PE27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double minutes;
		double years;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many minutes? ");
		
		minutes = s.nextDouble();
		
		years = minutes / 60 / 24 / 365;
		
		System.out.println("There are " + years + " years in " + minutes + " minutes.");
	}

}
