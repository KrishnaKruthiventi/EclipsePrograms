package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenNumbers {
	
	public static void removeEvenNumbers(ArrayList<Integer> nums) {
		nums.removeIf(n -> n % 2 == 0);
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		removeEvenNumbers(nums);
		System.out.println(nums);

	}

}
