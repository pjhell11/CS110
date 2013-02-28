package midterm;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many elements in array 1? ");
		int elem = s.nextInt();
		int[] arr1 = new int[elem];
		System.out.println("Input the first element");
		String input = s.next();
		arr1[0] = Integer.valueOf(input);
		
		for (int i = 1; i < elem; i++) {
			System.out.println("Input the next element");
			input = s.next();
			arr1[i] = Integer.valueOf(input);
		}
		
		System.out.println("How many elements in array 2? ");
		int elem2 = s.nextInt();
		int[] arr2 = new int[elem2];
		System.out.println("Input the first element");
		input = s.next();
		arr1[0] = Integer.valueOf(input);
		
		for (int j = 1; j < elem2; j++) {
			System.out.println("Input the next element");
			input = s.next();
			arr2[j] = Integer.valueOf(input);
		}
	}

}
