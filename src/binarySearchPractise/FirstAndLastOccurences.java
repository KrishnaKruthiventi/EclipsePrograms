package binarySearchPractise;

import java.util.Arrays;

public class FirstAndLastOccurences {
	
	public static int findFirstOccurence(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int firstOccurence = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) {
				firstOccurence = mid;
				end = mid - 1;
			} else if(nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		
		return firstOccurence;
	}
	
	public static int findLastOccurence(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int lastOccurence = -1;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) {
				lastOccurence = mid;
				start = mid + 1;
			} else if(nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		
		return lastOccurence;
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 2, 3, 4, 4, 5};
		int target = 2;
		int[] targetRange = {-1, -1};
		targetRange[0] = findFirstOccurence(arr, target);
		if(targetRange[0] != -1) {
			targetRange[1] = findLastOccurence(arr, target);
		}
		
		System.out.println(Arrays.toString(targetRange));

	}

}
