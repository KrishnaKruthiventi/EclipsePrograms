package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ListComparision {
	
	public static <T> boolean haveSameElements(ArrayList<T> list1, ArrayList<T> list2) {
		
		if (list1.size() != list2.size()) return false;
		
		HashMap<T, Integer> countMap = new HashMap<>();
		
		for(T item: list1) {
			countMap.put(item, countMap.getOrDefault(item, 0) + 1);
		}
		
		for(T item: list2) {
			if(!countMap.containsKey(item)) return false;
			
			countMap.put(item, countMap.get(item) - 1);
			if(countMap.get(item) == 0) countMap.remove(item);
		}
		
		return countMap.isEmpty();
	}

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
		
		System.out.println(haveSameElements(list1, list2));
		System.out.println(haveSameElements(list1, list3));
		
	}

}
