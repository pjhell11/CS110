package assignments.chap5;

public class PE510 {

	public static void main(String[] args) {
		int primes = 0;
		int number = 10000;
		for (int i = 2; i < number; i++){
			if (isPrime(i)==true){
				primes = primes + 1;
			}
			
		}
		System.out.println("The number of primes less than 10000 is " + primes);
		
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
