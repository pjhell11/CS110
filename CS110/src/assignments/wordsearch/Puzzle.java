package assignments.wordsearch;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Puzzle {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("PuzzleFile");
		Scanner s = new Scanner(file);
		int rows = s.nextInt();
		int cols = s.nextInt();
		String[] hPuzzle = new String[rows];
		String[] vPuzzle = new String[cols];
		char[][] buildVPuzzle = new char[rows][cols];
		
		//creates the puzzle in strings in the horizontal orientation
		for (int i = 0; i < rows; i++) {
			hPuzzle[i] = s.next();
		}
		
		//converts the puzzle to a 2D array, arranged sideways (vertical is now horizontal)
		for (int j = 0; j < cols; j++) {
			for (int k = 0; k < rows; k++){
				buildVPuzzle[j][k] = hPuzzle[k].charAt(j);
			}
		}
		
		//converts the previously made 2D array into a 1D array
		for (int l = 0; l < rows; l++) {
			StringBuilder sb = new StringBuilder();
			for (int m = 0; m < cols; m++) {
				sb.append(buildVPuzzle[l][m]);
			}
			vPuzzle[l] = sb.toString();
		}
		
		//list of words to check
		String[] words = {"cat", "pir", "pat", "tcr"};

		CheckHorizontal newCheckHorizontal = new CheckHorizontal(hPuzzle, words);
		CheckVertical newCheckVertical = new CheckVertical(vPuzzle, words);

		//checks for words in each direction
		newCheckHorizontal.forward(hPuzzle, words);
		newCheckHorizontal.backward(hPuzzle, words);
		newCheckVertical.down(vPuzzle, words);
		newCheckVertical.up(vPuzzle, words);
		


	}

}
