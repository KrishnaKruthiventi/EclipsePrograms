package maxSumInGivenRange;

public class MaxSumOfSubArray {
	
	public static int getMax(int[] arr, int k) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		
		for(int i = 0; i < k; i++) {
			currentSum += arr[i];
		}
		
		maxSum = currentSum;
		for(int i = k; i < arr.length; i++) {
			currentSum += arr[i] - arr[i - k];
			maxSum = Math.max(maxSum, currentSum);
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		
		System.out.println(getMax(arr, k));
	}
}
