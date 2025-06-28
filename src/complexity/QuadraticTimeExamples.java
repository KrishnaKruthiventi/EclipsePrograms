package complexity;

import java.util.Arrays;

public class QuadraticTimeExamples {
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		bubbleSort(arr);
		System.out.println("Bubble sorted: " + Arrays.toString(arr));
		
		int[] arr2 = {29, 10, 14, 37, 13};
		selectionSort(arr2);
		System.out.println("Selection sorted: " + Arrays.toString(arr2));

	}

}
