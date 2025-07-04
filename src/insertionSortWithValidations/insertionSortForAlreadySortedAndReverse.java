package insertionSortWithValidations;

import java.util.Arrays;

public class insertionSortForAlreadySortedAndReverse {

	public static void main(String[] args) {
		
//		int[] arr = {5, 2, 1, 3, 4};
//		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] arr = {5, 4, 3, 2, 1};
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = key; 
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
