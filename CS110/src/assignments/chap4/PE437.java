package assignments.chap4;

import java.util.Scanner;

public class PE437 {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		int d = s.nextInt();
		int r;
		String b = "";
		for (int i=d; i>0; i = i/2){
			r = d%2;
			d = d/2;
			b = r + b;
			
		}
		System.out.println("The binary form of that number is " + b);
	}

}
