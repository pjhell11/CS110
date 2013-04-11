package chap9;

import java.util.Scanner;

public class HangmanInterface {
	
//public static boolean again;
	
	public static void main(String[] args) {
		
		boolean again;
		do {
			Hangman guess = new Hangman();
			guess.pickWord();
			guess.buildWord();
			guess.buildDisplay();
			guess.printDisplay();
			String a;
			char g;
			Scanner s = new Scanner(System.in);
		
			do {
				System.out.println("Guess a letter.");
				a = s.next();
				g = a.charAt(0);
		
				guess.getGuess(g);
				guess.checkGuess();
				guess.printDisplay();
				guess.win();
			
			} while (guess.isComplete() == false);
			System.out.println("Would you like to play again? (y/n)");
			String answer = s.next();
			again = guess.playAgain(answer);
		} while(again == true);
		
	}

}
