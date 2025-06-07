package arraysPractise;

import java.util.Arrays;

public class ArrayChallenges {
	
	public static void rotateArray(int[] arr, int k) {
//		int[] firstSubString = Arrays.copyOfRange(arr, 0, k);
//		int[] secondSubString = Arrays.copyOfRange(arr, k, arr.length);
//		
//		System.arraycopy(secondSubString, 0, arr, 0, secondSubString.length);
//		System.arraycopy(firstSubString, 0, arr, secondSubString.length, firstSubString.length);
		
		k = k % arr.length;
		if(k < 0) k += arr.length;
		
		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, k - 1);
		reverseArray(arr, k , arr.length - 1);
		
	}
	
	public static int removeDuplicates(int[] arr) { // 0, 0, 1, 1, 1, 2, 2, 3, 3, 4
		if(arr.length == 0) return 0;
		
		int uniqueIndex = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[uniqueIndex]) {
				uniqueIndex++;
				arr[uniqueIndex] = arr[i];
			}
		}
		return uniqueIndex + 1;
	}
	
	public static int findKthLargest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[arr.length - k];
	}
	
	public static int[] reverseArray(int[] arr, int start, int end) {
		int low = 0;
		int high = arr.length - 1;
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Original array: " + Arrays.toString(arr));
		
		reverseArray(arr, 0, arr.length);
		System.out.println("Reversed array: " + Arrays.toString(arr));
		
		System.out.println("3rd largest: " + findKthLargest(arr, 3));
		
		int[] dupArr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int newLength = removeDuplicates(dupArr);
		System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(dupArr, newLength)));
		
		rotateArray(arr, 3);
		System.out.println("Array rotated by 3: " + Arrays.toString(arr));
	}

}
