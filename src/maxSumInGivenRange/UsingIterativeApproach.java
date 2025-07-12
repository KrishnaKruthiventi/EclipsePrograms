package maxSumInGivenRange;

public class UsingIterativeApproach {
	
	public static int getMaxSum(int[] arr, int k) {
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i <= arr.length - k; i++) {
			int currentSum = 0;
			
			for(int j = i; j < i + k; j++) {
				currentSum += arr[j];
			}
			
			maxSum = Math.max(maxSum, currentSum);
		}
		
		return maxSum;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {100, 500, 200, 700, 400};
		int k = 3;
		
		System.out.println(getMaxSum(arr, k));

	}

}
