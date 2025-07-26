package sqaureTheArray;

import java.util.Arrays;

public class UsingSorting {
	
	public static void findSquares(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		
		Arrays.sort(arr);
	}

	public static void main(String[] args) {
		int[] arr = {-5, -3, -2, 1, 3, 4, 5};
		findSquares(arr);
		System.out.println(Arrays.toString(arr));
	}

}
