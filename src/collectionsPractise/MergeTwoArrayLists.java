package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrayLists {
	
	public static <T> ArrayList<T> mergeAlternatively(ArrayList<T> listA, ArrayList<T> listB){
		ArrayList<T> merged = new ArrayList<>();
		int maxSize = Math.max(listA.size(), listB.size());
		
		for(int i = 0; i < maxSize; i++) {
			if(i < listA.size()) merged.add(listA.get(i));
			if(i < listB.size()) merged.add(listB.get(i));
		}
		
		return merged;
	}

	public static void main(String[] args) {
		
		ArrayList<String> listA = new ArrayList<>(Arrays.asList("A", "B", "C"));
		ArrayList<String> listB = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
		
		System.out.println(mergeAlternatively(listA, listB));
	}

}
