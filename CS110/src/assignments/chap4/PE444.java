package assignments.chap4;

public class PE444 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hits = 0;
		final int totalThrows = 1000000;
		for (int i = 0; i < totalThrows; i++) {
			double x = Math.random() * 2.0-1;
			double y = Math.random() * 2.0-1;
			double s = -x + 1;
			if (x < 0.0)
				hits += 1;
			else if (y<s && y>0 && x>0)
				hits += 1;
				
				
			//System.out.println(x);
			//System.out.println(y);
			//System.out.println(hits);
		}
		System.out.println("The probability of landing in an odd numbered zone is "
				+ hits/10000.0 + "%");
	}

}
