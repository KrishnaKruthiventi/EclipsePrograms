package arrayListPractise;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomArrayListLab {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("Alice", 20));
		students.add(new Student("Bob", 22));
		students.add(new Student("Charlie", 19));
		
		System.out.println("Original list: ");
		students.forEach(System.out::println);
		
		students.sort(Comparator.comparingInt(s -> s.age));
		System.out.println("\nSorted by age:");
		students.forEach(System.out::println);
		
		students.sort(Comparator.comparing(s -> s.name));
		System.out.println("\nSorted by name:");
		students.forEach(System.out::println);
	}

}
