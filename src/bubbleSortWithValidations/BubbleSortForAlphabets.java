package bubbleSortWithValidations;

import java.util.Arrays;

public class BubbleSortForAlphabets {

	public static void main(String[] args) {
		
//		char[] arr = {'A', 'D', 'E', 'C', 'B'};
//		char[] arr = {};
//		char[] arr = {'Z'};
//		char[] arr = {'A', 'B', 'C', 'D'};
//		char[] arr = {'D', 'C', 'B', 'A'};
//		char[] arr = {'A', 'A', 'A', 'A', 'A'};
		char[] arr = {'A', 'B', 'A', 'C', 'B', 'C', 'A'};
		
		
		int n = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
