package debuggingPractise;

public class ObjectBug {
	
	public static void printStudent(Student s) {
		System.out.println("Name: " + s.name.toUpperCase());
	}

	public static void main(String[] args) {
		
		Student s = new Student("krishna", 28);
		printStudent(s);

	}

}
