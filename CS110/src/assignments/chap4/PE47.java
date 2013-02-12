package assignments.chap4;

public class PE47 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tuition = 10000;
		double increase = 1.05;
		double total = 0;
		int end = 14;
		
		for (int year = 1; year <= end; year++){
			tuition = tuition * increase;
			if (year == 10){
				System.out.println("The cost of tuition in 10 years will be $" + tuition);

			}
			
			if (year >= 11){
				total = total + tuition;
				
			}
		}
		System.out.println("The total cost for the next four years, after the initial 10 will be $" + total);

	}

}
