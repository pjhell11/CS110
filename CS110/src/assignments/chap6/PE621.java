package assignments.chap6;

import java.util.Scanner;

public class PE621 {

	public static void main(String[] args) {
		int balls;
		int slotNum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of balls. ");
		balls = s.nextInt();
		double direction;
		
		System.out.println("Enter the number of slots for the machine. ");
		slotNum = s.nextInt();
		String slots[] = new String[slotNum];
		
		for (int h = 0; h < slotNum; h++) {
			slots[h] = "Slot " + (h+1) + ": ";
		}
		
		for (int i = 0; i < balls; i++) {
			int r = 0;
			for (int j = 0; j < slotNum-1; j++){
				direction = Math.random();
				if (direction < .5){
					System.out.print("L");
					r++;
				}
				else
					System.out.print("R");
			}
			slots[r] = slots[r] + "0";
			System.out.println();
		}
		System.out.println();
		for (int k=0; k<slotNum; k++) {
			System.out.println(slots[k]);
		}

	}

}