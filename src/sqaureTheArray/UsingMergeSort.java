package sqaureTheArray;

import java.util.Arrays;

public class UsingMergeSort {
	
	public static int[] findSquares(int[] arr) {
		int left = 0, right = 0;
		int index = 0;
		int size = arr.length;
		int[] result = new int[size];
		
		while(arr[index] < 0) {
			right++;
			index++;
		}
		
		index = 0;
		left = right - 1;
		
		while(left >= 0 && right < size) {
			if(arr[left] * arr[left] < arr[right] * arr[right]) {
				result[index] = arr[left] * arr[left];
				left--;
				index++;
			} else {
				result[index] = arr[right] * arr[right];
				right++;
				index++;
			}
		}
		
		while(left >= 0) {
			result[index] = arr[left] * arr[left];
			left--;
			index++;
		}
		
		while(right < size) {
			result[index] = arr[right] * arr[right];
			right++;
			index++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {-5, -2, -1, 1, 3, 4, 5};
		System.out.println(Arrays.toString(findSquares(arr)));

	}

}
