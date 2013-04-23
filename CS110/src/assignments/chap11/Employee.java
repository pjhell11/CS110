package assignments.chap11;

import java.util.Calendar;

public class Employee extends Person {
	protected String office;
	protected int salary;
	protected Calendar dateHired;
	
	@Override
	public String toString() {
		return "Employee " + name;
	}

}
