package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
	
	public static void sort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		
		int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
		int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);
		
		int i = 0, j = 0, k = left;
		
		while(i < leftArr.length && j < rightArr.length) {
			if(leftArr[i] < rightArr[j]) {
				arr[k++] = leftArr[i++];
			}
			else {
				arr[k++] = rightArr[j++];
			}
		}
		
		while(i < leftArr.length) {
			arr[k++] = leftArr[i++];
		}
		
		while(j < rightArr.length) {
			arr[k++] = rightArr[j++];
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 1, 3, 6, 4, 5, 2};
		sort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));

	}

}
