package assignments.chap4;

public class PE425 {


	public static void main(String[] args) {
		double p = 0;
		
		for (int h=10000; h <= 100000; h=h+10000){
			double sum = 0;
			for (int i=1; i<=h; i=i+2){
				sum += (1.0/(2.0*i-1.0)-1.0/(2.0*i+1.0));
			}
			p=4*sum;
			System.out.println("The value of pi for h=" + h + " is " + p);
		}
	}

}
