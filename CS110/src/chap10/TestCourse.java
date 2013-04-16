package chap10;

public class TestCourse {
	public static void main(String[] args) {
		
		Course course = new Course("CS110");
		
		course.addStudent("Al");
		course.addStudent("Bob");
		course.addStudent("Will");
		course.dropStudent("Bob");
		
		int numberOfStudents = course.getNumberOfStudents();
		
		System.out.println("Number of students in " + course.getCourseName() + ": " + numberOfStudents);
		String[] students = course.getStudents();
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print(students[i] + ", ");
		}
	}

}
