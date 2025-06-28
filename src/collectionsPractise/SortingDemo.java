package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5));
		List<String> names = new ArrayList<>(Arrays.asList("Bob", "Alice", "Charlie"));
		
		Collections.sort(numbers);
		System.out.println("Sorted numbers: " + numbers);
		
		Collections.sort(names);
		System.out.println("Sorted names: " + names);
		
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("Reverse sorted numbers: " + numbers);
		
		Collections.sort(names, (a,b) -> a.length() - b.length());
		System.out.println("Sorted by length: " + names);

	}

}
