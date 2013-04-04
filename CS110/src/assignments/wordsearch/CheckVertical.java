package assignments.wordsearch;

public class CheckVertical {
	
	private String[] puzzle;
	private String[] words;
	
	public CheckVertical(String[] newPuzzle, String[] newWords) {
		puzzle = newPuzzle;
		words = newWords;

	}
	
	public void down(String[] puzzle, String[] words) {
		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < puzzle.length; j++) {
				int a = puzzle[j].indexOf(words[i]);
				if (a != -1) {
					System.out.println(words[i] + " found Southerly at " + a + ", " + j);
				}
			}
		}
	}
	
	public void up(String[] puzzle, String[] words) {
		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < puzzle.length; j++){
				StringBuffer sb = new StringBuffer(puzzle[j]);
				int a = sb.reverse().indexOf(words[i]);
				int location = a + (words[i].length()-1);
				if (a != -1) {
					System.out.println(words[i] + " found Northerly at " + location + ", " + j);
				}
			}
		}
	}
}
