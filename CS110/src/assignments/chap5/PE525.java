package assignments.chap5;

import java.util.Scanner;

public class PE525 {

	public static void main(String[] args) {
		long input;
		Scanner s = new Scanner(System.in);
		System.out.println("How many milliseconds?");
		input = s.nextLong();
		convertMillis(input);
	}
	public static String convertMillis(long millis) {
		String time = "";
		long hours = millis/3600000;
		millis = millis%3600000;
		time = time + hours + ":";
		
		long minutes = millis/60000;
		millis = millis%60000;
		time = time + minutes + ":";
		
		long seconds = millis/1000;
		millis = millis%60000;
		time = time + seconds;
		
		System.out.println("The number of milliseconds is equal to " + time);

		return time;
		
		
	}
}
