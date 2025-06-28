package arraysPractise2;

import java.util.Arrays;

public class ArraySortSearch {

	public static void main(String[] args) {
		
		int[] numbers = {5, 2, 9, 1, 5};
		String[] names = {"Bob", "Alice", "Charlie"};
		
		Arrays.sort(numbers);
		System.out.println("Sorted numbers: " + Arrays.toString(numbers));
		
		Arrays.sort(names);
		System.out.println("Sorted names: " + Arrays.toString(names));
		
		int index = Arrays.binarySearch(numbers, 5);
		System.out.println("Index of 5: " + index);
		
		int notFound = Arrays.binarySearch(numbers, 7);
		System.out.println("Index of 7: " + notFound);

	}

}
