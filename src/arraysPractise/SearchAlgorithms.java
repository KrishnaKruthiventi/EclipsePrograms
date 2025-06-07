package arraysPractise;

public class SearchAlgorithms {
	
	public static int linearSearch(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) return i;
		}
		
		return -1;
	}
	
	public static int binarySearch(int[] arr, int target) {
		int left = 0, right = arr.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == target) return mid;
			else if(arr[mid] > target) right = mid - 1;
			else left = mid + 1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] sortedArr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int[] unsortedArr = {23, 5, 16, 12, 2, 72, 56, 8, 91, 38};
		
		System.out.println("Linear search for 16: " + linearSearch(unsortedArr, 16));
		System.out.println("Binary search for 16: " + binarySearch(sortedArr, 91));

	}

}
