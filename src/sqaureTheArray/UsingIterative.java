package sqaureTheArray;

import java.util.Arrays;

public class UsingIterative {
	
	public static void iterativeSquares(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 6, 8, 9};
		System.out.println(Arrays.toString(arr));

	}

}
