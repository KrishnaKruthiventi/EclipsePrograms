package arraysPractise;

import java.util.Arrays;
import java.util.Random;

public class ArrayApplications {
	
	public static int[] generateRandomArray(int size, int min, int max) {
		Random rand = new Random();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = rand.nextInt(max - min + 1) + min;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] randomArr = generateRandomArray(10, 1, 100);
		System.out.println("Random array: " + Arrays.toString(randomArr));
		
	}

}
