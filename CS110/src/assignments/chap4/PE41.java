package assignments.chap4;

import java.util.Scanner;

public class PE41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int input;
		int positive = 0;
		int negative = 0;
		int total = 0;
		int together = 0;
		float average = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please input an integer. ");
		input = s.nextInt();

		while (input != 0) {
			together = together + input;
			total++;
			if (input % 2 == 0){
				positive++;
			}
			else{
				negative++;
			}
			
			System.out.println("Please input an integer. ");
			input = s.nextInt();
			
			
		}
		
		average = together / total;
		
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);

	}

}
