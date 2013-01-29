package assignments.chap2;

import java.util.Scanner;

public class PE210 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double amount;
		double initialTemp;
		double finalTemp;
		double energy;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input the weight of the water in kilograms. ");
		
		amount = s.nextDouble();
		
		System.out.println("Input the inital temperature of the water. ");
		
		initialTemp = s.nextDouble();
		
		System.out.println("Input the final temperature of the water. ");
		
		finalTemp = s.nextDouble();
		
		energy = amount * (finalTemp - initialTemp) * 4184;
		
		System.out.println("It takes " + energy + " joules to heat " + amount + " kilograms of water from " + initialTemp + " degrees to " + finalTemp + " degrees.");

	}

}
