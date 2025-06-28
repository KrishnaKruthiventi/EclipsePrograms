package arraysPractise2;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3};
		String[] names = {"Alice", "Bob"};
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(names));
		
		int[][] matrix = {{1, 2}, {3, 4}};
		System.out.println(Arrays.deepToString(matrix));

	}

}
