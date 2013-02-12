package assignments.chap4;

public class PE415 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for (int i = 33; i < 128; i++) {
			System.out.print((char)i + " ");
			
			a = a + 1;
			
			if (a == 10){
				System.out.println("");
				a = 0;
			}
		}

	}

}
