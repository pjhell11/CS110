package assignments.chap2;

import java.util.Scanner;

public class PE225 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		double hours;
		double payRate;
		double fedTax;
		double stateTax;
		double gross;
		double fedTotal;
		double stateTotal;
		double deduction;
		double net;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input the name. ");
		
		name = s.next();
		
		System.out.println("Input the hours worked in a week. ");
		
		hours = s.nextDouble();
		
		System.out.println("Input the hourly pay rate. ");
		
		payRate = s.nextDouble();
		
		System.out.println("Input the federal tax rate (in percent). ");
		
		fedTax = s.nextDouble();
		
		System.out.println("Input the state tax rate (in percent). ");
		
		stateTax = s.nextDouble();
		
		gross = hours * payRate;
		
		fedTotal = (fedTax/100) * gross;
		
		stateTotal = (stateTax/100) * gross;
		
		deduction = fedTotal + stateTotal;
		
		net = gross - deduction;
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay rate: $" + payRate);
		System.out.println("Gross pay: $" + gross);
		System.out.println("Deductions:");
		System.out.println("   Federal Withholding (" + fedTax + "%): $" + fedTotal);
		System.out.println("   State Withholding (" + stateTax + "%); $" + stateTotal);
		System.out.println("   Total Deduction: $" + deduction);
		System.out.println("Net pay: $" + net);


	}

}
