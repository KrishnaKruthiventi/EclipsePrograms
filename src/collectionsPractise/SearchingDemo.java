package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 5, 5, 9));
		
		int index = Collections.binarySearch(numbers, 5);
		System.out.println("Index of 5: " + index);
		
		int notFound = Collections.binarySearch(numbers, 7);
		System.out.println("Index of 7: " + notFound);
	}

}
