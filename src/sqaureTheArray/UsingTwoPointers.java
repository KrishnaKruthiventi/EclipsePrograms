package sqaureTheArray;

import java.util.Arrays;

public class UsingTwoPointers {
	
	public static int[] findSquares(int[] arr) {
		int size = arr.length;
		int[] result = new int[size];
		int left = 0;
		int right = arr.length - 1;
		int i = right;
		
		while(i >= 0) {	
			int firstSqaure = arr[left] * arr[left];
			int secondSquare = arr[right] * arr[right];
			
			if(left == right) {
				result[i] = firstSqaure;
			} else {
				if(firstSqaure == secondSquare) {
					result[i - 1] = firstSqaure;
					result[i] = secondSquare;
					i--;
					left++;
					right--;
				} else if(firstSqaure < secondSquare) {
					result[i] = secondSquare;
					right--;
				} else {
					result[i] = firstSqaure;
					left++;
				}
			}
			i--;
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] input = {-10, -8, -5, 1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(findSquares(input)));
	}

}
