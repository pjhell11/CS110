package assignments.chap5;

import java.util.Scanner;

public class PE531 {

	public static void main(String[] args) {
		long ccn;
		Scanner s = new Scanner(System.in);
		System.out.println("Input a credit card number. ");
		ccn = s.nextLong();
		if (isValid(ccn)==true)
			System.out.println("This is a valid credit card number!");
		if (isValid(ccn)==false)
			System.out.println("This is NOT a valid credit card number!");

	}
	public static boolean isValid(long number) {
		boolean valid = false;
		
		if ((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number)) % 10 == 0){
			if (prefixMatched(number)== true)
				valid = true;

		}
		return valid;
		
	}
	public static int sumOfDoubleEvenPlace(long number) {
		long digit;
		int total = 0;
		number = number/10;
		while (number != 0) {
			digit = (number % 10) * 2;
			number = number / 100;
			total = total + getDigit((int) digit);
		}
		return total;
	}
	public static int getDigit(int number) {
		if (number > 9)
			number = (number%10)+1;
		return number;
		
	}
	public static int sumOfOddPlace(long number) {
		long digit;
		int total = 0;
		while (number != 0) {
			digit = (number % 10);
			number = number / 100;
			total = total + getDigit((int) digit);
		}
		return total;
	}
	public static boolean prefixMatched(long number) {
		if (getPrefix(number, 1) == 4)
			return true;
		else if (getPrefix(number, 1) == 5)
			return true;
		else if (getPrefix(number, 1) == 6)
			return true;
		else if (getPrefix(number, 2) == 37)
			return true;
		else
			return false;
	}
	public static int getSize(long d) {
		int size = String.valueOf(d).length();
		return size;
		
	}
	public static long getPrefix(long number, int k) {
		long prefix = number;
		for (int i = 0; i < getSize(number) - k; i++){
			prefix = prefix / 10;
		}
		return prefix;
		
	}
}
