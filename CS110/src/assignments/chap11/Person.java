package assignments.chap11;

public class Person {
	protected String name;
	protected String address;
	protected String phone;
	protected String email;
	
	@Override
	public String toString() {
		return "Person " + name;
	}

}
