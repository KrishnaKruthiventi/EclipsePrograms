package arrayListPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
	
	public static <T> Map<T, Integer> countFrequency(ArrayList<T> words){
		Map<T, Integer> frequencyMap = new HashMap<>();
		
		for(T item: words) {
			frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
		}
		
		return frequencyMap;
	}

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
		System.out.println(countFrequency(words));

	}

}
