package assignments.chap5;

public class PE526 {

	public static void main(String[] args) {
		int palPrimes = 100;
		int primesInLine = 0;
		int number = 2;
		String primeString = null;
		
		while (palPrimes > 0) {
			if (isPrime(number) == true) {
				primeString = String.valueOf(number);
			
				if (number == Integer.valueOf(reverse(primeString))) {
					System.out.print(number + " ");
					palPrimes = palPrimes - 1;
					primesInLine = primesInLine + 1;
				}

			}
			number = number + 1;
			if (primesInLine == 10) {
				System.out.println();
				primesInLine = 0;
			}
		}

	}


	public static String reverse(String prime) {
		String reverse = "";
		for (int i = prime.length() - 1; i >= 0; i--) {
			reverse += prime.charAt(i);
		}
		return reverse;

	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}

