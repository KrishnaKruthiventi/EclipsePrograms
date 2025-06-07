package arraysPractise;

import java.util.Arrays;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {12, 5, 27, 8, 16, 3};
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		int key = 12;
		int index = Arrays.binarySearch(numbers, key);
		System.out.println(key + " found at index: " + index);
		
		int[] copy1 = Arrays.copyOf(numbers, 10);
		int[] copy2 = Arrays.copyOfRange(numbers, 2, 5);
		System.out.println("Full copy: " + Arrays.toString(copy1));
		System.out.println("Range copy: " + Arrays.toString(copy2));
		
		int[] filledArray = new int[5];
		Arrays.fill(filledArray, 42);
		System.out.println("Filled Array: " + Arrays.toString(filledArray));
		
		System.out.println("Arrays equal? " + Arrays.equals(numbers, copy1));
	}

}
