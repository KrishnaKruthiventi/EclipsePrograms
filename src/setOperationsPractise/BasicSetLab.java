package setOperationsPractise;

import java.util.HashSet;
import java.util.Set;

public class BasicSetLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> programmingLanguages = new HashSet<>();
		
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("Java");
		
		System.out.println("Set contents: " + programmingLanguages);
		
		System.out.println("Contains Java? " + programmingLanguages.contains("Java"));
		System.out.println("Contains C++? " + programmingLanguages.contains("C++"));
		
		programmingLanguages.remove("Python");
		System.out.println("After removal: " + programmingLanguages);
		
		System.out.println("Iterating through set:");
		for(String language: programmingLanguages) {
			System.out.println(language);
		}
		
		System.out.println("Set size: " + programmingLanguages.size());
		programmingLanguages.clear();
		System.out.println("Set after clear: " + programmingLanguages);
	}

}
