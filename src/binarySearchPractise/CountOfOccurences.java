package binarySearchPractise;

public class CountOfOccurences {
	
	public static int countOccurences(int[] arr, int k) {
		int low = 0;
		int high = arr.length - 1;
		int firstOccurence = 0;
		int secondOccurence = 0;
		int count = 0;
		boolean isThere = false;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == k) {
				firstOccurence = mid;
				isThere = true;
				high = mid - 1;
			} else if(arr[mid] < k) {
				low = mid  +1;
			} else {
				high = mid - 1;
			}
		}
		
		low = 0;
		high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == k) {
				secondOccurence = mid;
				low = mid + 1;
			} else if(arr[mid] < k) {
				low = mid  +1;
			} else {
				high = mid - 1;
			}
		}
		
		if(isThere) count = secondOccurence - firstOccurence + 1;
		else count = -1;
		
		return count;
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5};
		int k = 2;
		int count = countOccurences(arr, k);
		System.out.println(count);

	}

}
