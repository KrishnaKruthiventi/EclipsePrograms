package arraysPractise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr){
		Set<Integer> set = new HashSet<>(arr);
		arr = new ArrayList<>(set);
		
		return arr;
	}

	public static void main(String[] args) {
		
		Integer[] nums = {1, 2, 3, 3, 4, 2, 1, 4, 5, 5, 6, 7, 3};
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(nums));
		
		ArrayList<Integer> newArr = removeDuplicates(arr);
		System.out.println(newArr);

	}

}
