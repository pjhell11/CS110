package chap10;

import java.util.Scanner;

public class ATM_User {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ATM atm = new ATM();
		atm.setAccount();
		
		double amount = 0;
		int neverEnding = 0;
		do {
		
			System.out.println("Enter an id: ");
			int id = s.nextInt();
		
			int input = 0;
			do {
				System.out.println("Main Menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
			
				input = s.nextInt();
			
				if (input == 1) {
					System.out.println("The balance is $" + atm.checkBalance(id));
					System.out.println();
				}
			
				if (input == 2) {
					amount = 0;
					System.out.println("Enter an amount to withdraw: ");
					amount = s.nextDouble();
					atm.withdraw(id, amount);
					System.out.println();

				}
			
				if (input == 3) {
					amount = 0;
					System.out.println("Enter an amount to deposit: ");
					amount = s.nextDouble();
					atm.deposit(id, amount);
					System.out.println();

				}
				
				if (input <= 0 || input >= 5) {
					System.out.println("Invalad command.");
					System.out.println();

				}
			
			} while(input != 4);
		} while(neverEnding == 0);
		
	}

}
