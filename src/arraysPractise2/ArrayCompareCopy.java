package arraysPractise2;

import java.util.Arrays;

public class ArrayCompareCopy {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		int[] arr3 = {4, 5, 6};
		
		boolean isEqual = Arrays.equals(arr1, arr2);
		System.out.println("arr1 == arr2? " + isEqual);
		
		int[] copy = Arrays.copyOf(arr1, arr1.length);
		System.out.println("Copied array: " + Arrays.toString(copy));
		
		int[] extendedCopy = Arrays.copyOf(arr3, 5);
		System.out.println("Extended copy: " + Arrays.toString(extendedCopy));
	}
}
