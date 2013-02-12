package assignments.chap4;

import java.util.Scanner;

public class PE49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int students;
		String name1;
		String name2 = null;
		String name3 = null;
		double score1;
		double score2 = 0;
		double score3 = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many Students are in the class? ");
		students = s.nextInt();
		
		System.out.println("Enter a student's name ");
		name1 = s.next();
		
		System.out.println("Enter the score for this student ");
		score1 = s.nextDouble();
		
		
		for (int i = 0; i < students - 1;  i++) {

			System.out.println("Enter the student's name ");
			name2 = s.next();
			
			System.out.println("Enter the score for this student ");
			score2 = s.nextDouble();
			
			if (score2 > score1) {
				score3 = score1;
				score1 = score2;
				name3 = name1;
				name1 = name2;
			
			}
			if (score3 > score2) {
				score2 = score3;
				name2 = name3;
			}
			
		}
		if (name1 == name2) {
			score2 = score3;
			name2 = name3;
		}
		
		System.out.println("The top student is " + name1 + " with a score of " + score1);
		System.out.println("The next student is " + name2 + " with a score of " + score2);
		
	}

}
