package findDuplicates;

import java.util.HashSet;
import java.util.Set;

public class UsingHashSet {
	
	public static void findDuplicates(int[] arr) {
		System.out.println("HashSet: ");
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		for(int num: arr) {
			if(!seen.add(num)) {
				duplicates.add(num);
			}
		}
		
		for(int num: duplicates) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {11, 22, 11, 22, 33, 44, 55, 33};
		findDuplicates(arr);

	}

}
