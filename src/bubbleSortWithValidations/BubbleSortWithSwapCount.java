package bubbleSortWithValidations;

import java.util.Arrays;

public class BubbleSortWithSwapCount {

	public static void main(String[] args) {
		
//		int[] arr = {5, 3, 4, 1, 2};
//		int[] arr = {};
//		int[] arr = {5, 4, 3, 2, 1};
//		int[] arr = {1, 2, 3, 4, 5};
//		int[] arr = {5, 5, 5, 5, 5};
		int[] arr = {1, 2, 2, 5, 4, 1, 5};
		int swapCount = 0;
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swapCount++;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(swapCount);

	}

}
