package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
	
	public static <T> ArrayList<T> findDuplicates(ArrayList<T> list){
		Set<T> uniqueElements = new HashSet<>();
		ArrayList<T> duplicates = new ArrayList<>();
		
		for(T item : list) {
			if(!uniqueElements.add(item)) {
				if(!duplicates.contains(item)) {
					duplicates.add(item);
				}
			}
		}
		
		return duplicates;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 3, 4, 5));
		System.out.println(findDuplicates(numbers));
	}

}
