package midterm;

public class PrintMonth {

	public static void main(String[] args) {
		printMonth(5, 31);
		printMonth(2, 28);
		printMonth(6, 30);

	}
	public static void printMonth(int startDay, int daysInMonth) {
		int dayInWeek = 0;
		System.out.println(" Sun Mon Tue Wed Thr Fri Sat");
		for (int i = 1; i < startDay; i++) {
			System.out.printf("    ");
			dayInWeek = dayInWeek + 1;
		}
		for (int j = 0; j < daysInMonth; j++) {
			System.out.printf("%4s", j + 1);
			dayInWeek = dayInWeek + 1;
			if (dayInWeek == 7) {
				System.out.println();
				dayInWeek = 0;
			}
		}
		System.out.println();
		System.out.println();


	}
}
