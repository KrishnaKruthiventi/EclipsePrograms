package twoPointersPrograms;

import java.util.Arrays;

public class FindTheClosestpair {
	
	public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		int totalSize = size1 + size2;
		
		int[] result = new int[totalSize];
		int firstPointer = 0;
		int secondPointer = 0;
		int index = 0;
		
		while(firstPointer < size1 && secondPointer < size2) {
			if(arr1[firstPointer] < arr2[secondPointer]) {
				result[index] = arr1[firstPointer];
				index++;
				firstPointer++;
			}
			else {
				result[index] = arr2[secondPointer];
				index++;
				secondPointer++;
			}
		}
		
		while(firstPointer < size1) {
			result[index] = arr1[firstPointer];
			index++;
			firstPointer++;
		}
		
		while(secondPointer < size2) {
			result[index] = arr2[secondPointer];
			index++;
			secondPointer++;
		}
		
		return result;
	}
	
	public static int[] findPair(int[] result, int target) {
		int left = 0;
		int right = result.length - 1;
		int[] pair = new int[2];
		
		while(left <= right) {
			int sum = result[left] + result[right];
			if(sum == target) {
				pair[0] = result[left];
				pair[1] = result[right];
				break;
			} else if(sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return pair;
	}
	
	public static void main(String[] args) {
		int[] arr1= {1, 4, 5, 7};
		int[] arr2 = {10, 20, 30, 40};
		int target = 13;
		
		int[] result = mergeTwoArrays(arr1,arr2);
		int[] pair = findPair(result, target);
		System.out.println(Arrays.toString(pair));
	}

}
