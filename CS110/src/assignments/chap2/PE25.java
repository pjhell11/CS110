package assignments.chap2;

import java.util.Scanner;

public class PE25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double bill;
		double tipRate;
		double tip;
		double total;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input the subtotal of the bill ");
		
		bill = s.nextDouble();
		
		System.out.println("Input the tip rate, in percent ");
		
		tipRate = s.nextDouble();
		
		tip = bill * (tipRate / 100);
		
		total = bill + tip;
		
		System.out.println("The tip is $" + tip + " and the total is $" + total);

	}

}
