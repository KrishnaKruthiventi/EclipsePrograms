package arraysPractise2;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 1, 5, 3};
		Arrays.sort(arr);
		int len = arr.length;
		int index;
		int index1;
		if(len % 2 != 0) {
			index = len / 2;
			System.out.println(arr[index]);
		}
		else {
			index = len / 2;
			index1 = index - 1;
			System.out.println((double) (arr[index] + arr[index1])/ 2);
		}
		

	}

}
