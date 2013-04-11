package chap9;

public class Hangman {

	private String[] words = {"correct", "jump", "disco", "january", "xylophone", "jazz", 
			"microphone", "butterflies", "pockets", "request", "quiz", "jam", "rhythm", "squid",};
	private String word;
	private char[] display;
	private char guess;
	private int miss = 0;
	private int correct = 0;

public void pickWord() {
	int i = (int) (Math.random() * this.words.length);
	this.word = this.words[i];
}

public char[] buildWord() {
	char[] index = new char[this.word.length()];
	for (int i = 0; i < this.word.length(); i++) {
		index[i] = word.charAt(i);
	}
	return index;
}

public void buildDisplay() {
	this.display = new char[this.word.length()];
	for (int i = 0; i < this.word.length(); i++) {
		this.display[i] = 42;
	}
}

public void changeDisplay(int i){
	this.display[i] = this.word.charAt(i);
}

public void checkGuess() {
	int count = 0;
	for(int i = 0; i<this.word.length(); i++) {
		if (this.guess == this.word.charAt(i) && this.guess != this.display[i]) {
			this.display[i] = this.guess;
			count += 1;
		}
	}
	this.correct += count;
	if (count == 0) {
		this.miss += 1;
	}
}

public void win() {
	if (this.correct == this.word.length()) {
		System.out.println("Congratulations! You have correctly guessed the word " + this.word +
				"! You missed a total of " + this.miss + " times.");
	}
}

public void getGuess(char guess) {
	this.guess = guess;
}

public void printDisplay() {
	System.out.println();
	for (int i = 0; i < this.display.length; i++) {
		System.out.print(this.display[i]);
	}
	System.out.println();
}

public boolean isComplete() {
	boolean complete = false;
	if (this.correct == this.word.length()) {
		complete = true;
	}
	return complete;
}

public boolean playAgain(String answer) {
	boolean again = true;
	char y = 'y';
	if (y != answer.charAt(0)) {
		again = false;
	}
	return again;
}

}