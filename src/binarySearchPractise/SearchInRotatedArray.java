package binarySearchPractise;

import java.util.Arrays;

public class SearchInRotatedArray {
	
	public static int[] rotateArray(int[] arr, int k) {
		k = k % arr.length;
		int[] result = new int[arr.length];
		System.arraycopy(arr, k, result, 0, arr.length - k);
		System.arraycopy(arr, 0, result, arr.length - k, k);
		return result;
	}
	
	public static int searchRotatedArray(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(arr[mid] == target) {
				return mid;
			} 
			
			if(arr[mid] >= arr[start]) {
				if(target >= arr[start] && target < arr[mid]) {
					end = mid - 1;
				} else start = mid + 1;
			} else {
				if(target > arr[mid] && target <= arr[end]) {
					start = mid + 1;
				} else end = mid - 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9};
		int k = 3;
		int target = 5;
		int[] rotArr = rotateArray(arr, k);
		System.out.println(Arrays.toString(rotArr));
		
		int index = searchRotatedArray(rotArr, target);
		System.out.println(index);
	}

}
