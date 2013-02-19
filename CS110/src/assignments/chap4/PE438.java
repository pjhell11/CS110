package assignments.chap4;

import java.util.Scanner;

public class PE438 {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		int d = s.nextInt();
		int r;
		String h = "";
		for (int i=d; i>0; i = i/16){
			r = d%16;
			d = d/16;
			if (r==10)
				h = "A" + h;
			if (r==11)
				h = "B" + h;
			else if (r==12)
				h = "C" + h;
			else if (r==13)
				h = "D" + h;
			else if (r==14)
				h = "E" + h;
			else if (r==15)
				h = "F" + h;
			else
				h = r + h;
		}
		System.out.println("The hex form of that number is " + h);
		
	}

}
