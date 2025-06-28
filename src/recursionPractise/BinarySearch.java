package recursionPractise;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int target, int low, int high) {
		if(low > high) return -1;
		
		int mid = low + (high - low) / 2;
		
		if(arr[mid] == target) {
			return mid;
		}
		else if(arr[mid] > target) {
			return binarySearch(arr, target, low, mid - 1);
		} 
		else {
			return binarySearch(arr, target, mid + 1, high);
		}
	}

	public static void main(String[] args) {
		
		int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int target = 91;
		int result = binarySearch(sortedArray, target, 0, sortedArray.length - 1);
		System.out.println("Element found at index: " + result);

	}

}
