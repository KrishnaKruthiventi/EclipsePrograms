package sortingAlgorithms;

import java.util.Arrays;

public class EasyCountingSort {
	
	public static void countingSort(int[] arr) {
		int max = arr[0];
		
		for(int num: arr) {
			max = max > num ? max : num;
		}
		
		int[] count = new int[max + 1];
		
		for(int num: arr) {
			count[num]++;
		}
		
		int index = 0;
		for(int num = 0; num < count.length; num++) {
			while(count[num] > 0) {
				arr[index] = num;
				index++;
				count[num]--;
			}
		}
	}

	public static void main(String[] args) {
		
		int[] numbers = {3, 1, 4, 1, 2, 4, 3};
		System.out.println("Before sorting: " + Arrays.toString(numbers));
		
		countingSort(numbers);
		
		System.out.println("After Sorting: " + Arrays.toString(numbers));

	}

}
