package arraysPractise;

import java.util.Arrays;

public class SortAlgorithms {
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) minIndex = j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Original Array: " + Arrays.toString(arr1));
		
		bubbleSort(arr1);
		System.out.println("After bubble sort: " + Arrays.toString(arr1));
		
		int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
		selectionSort(arr2);
		System.out.println("After selection sort: " + Arrays.toString(arr2));

	}

}
