package assignments.wordsearch;

public class CheckHorizontal {

	private String[] puzzle;
	private String[] words;
	
	public CheckHorizontal(String[] newPuzzle, String[] newWords) {
		puzzle = newPuzzle;
		words = newWords;

	}
	
	public void forward(String[] puzzle, String[] words) {
		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < puzzle.length; j++) {
				int a = puzzle[j].indexOf(words[i]);
				if (a != -1) {
					System.out.println(words[i] + " found Easterly at " + j + ", " + a);
				}
			}
		}
	}
	
	public void backward(String[] puzzle, String[] words) {
		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < puzzle.length; j++){
				StringBuffer sb = new StringBuffer(puzzle[j]);
				int a = sb.reverse().indexOf(words[i]);
				int location = a + words[i].length();
				if (a != -1) {
					System.out.println(words[i] + " found Westerly at " + j + ", " + location);
				}
			}
		}
	}
}
