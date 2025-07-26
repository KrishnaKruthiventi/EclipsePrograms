package findDuplicates;

import java.util.Arrays;

public class SortingAndScaning {
	
	public static void findDuplicates(int[] arr) {
		System.out.println("Sorting + Scan: ");
		Arrays.sort(arr);
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i - 1]) {
				System.out.print(arr[i] + " ");
				while(i < arr.length && arr[i] == arr[i - 1]) {
					i++;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {11, 11, 22, 11, 22, 44, 55, 33, 44, 55, 33};
		findDuplicates(arr);

	}

}
