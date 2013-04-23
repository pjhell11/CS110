package assignments.chap11;

public class Faculty extends Employee {
	public static int PROFESSOR = 1;
	public static int ASSISTANT = 2;
	
	protected String officeHours;
	protected int rank;
	
	@Override
	public String toString() {
		return "Faculty " + name;
	}

}
