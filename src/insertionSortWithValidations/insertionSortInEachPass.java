package insertionSortWithValidations;

import java.util.Arrays;

public class insertionSortInEachPass {

	public static void main(String[] args) {
		
//		int[] arr = {3, 5, 1, 4, 2, 6};
		int[] arr = {6, 5, 4, 3, 2, 1};
		int n = arr.length;
		int noOfIterations = 0;
		
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
				noOfIterations++;
			}
			
			arr[j + 1] = key;
//			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(noOfIterations);
	}

}
