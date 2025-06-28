package bubbleSortWithValidations;

import java.util.Arrays;

public class BubbleSortWithDescendingOrder {

	public static void main(String[] args) {
		
//		int[] arr = {2, 3, 1, 5, 4};
//		int[] arr = {};
//		int[] arr = {5, 4, 3, 2, 1};
//		int[] arr = {1, 2, 3, 4, 5};
//		int[] arr = {5, 5, 5, 5, 5};
		int[] arr = {1, 2, 2, 5, 4, 1, 5};
		int n = arr.length;
		
		for(int i = n - 1; i > 0; i--) {
			for(int j = i - 1; j >= 0; j--) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
