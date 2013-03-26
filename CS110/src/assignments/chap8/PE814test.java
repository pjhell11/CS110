package assignments.chap8;

import java.util.Random;

public class PE814test {

	public static void main(String[] args) {
		Stopwatch now = new Stopwatch();
		
		int[] list = new int[100000];
		
		Random random1 = new Random();
		
		for (int i = 0; i <100000; i++) {
			list[i] = random1.nextInt(100000);
		}
		
		now.start();
		
		java.util.Arrays.sort(list);
		
		now.end();
		
		double elapsedTime = now.getElapsedTime();
		
		System.out.println("It took " + elapsedTime + " miliseconds to sort the list of 100,000 random numbers.");

	}

}
