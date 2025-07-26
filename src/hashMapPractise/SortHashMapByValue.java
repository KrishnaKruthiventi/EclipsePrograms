package hashMapPractise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Alice", 25);
		map.put("Bob", 30);
		map.put("Charlie", 20);
		
		
		List<Map.Entry<String, Integer>> sorted = map.entrySet()
				.stream()
				.sorted((a, b) -> b.getValue() - a.getValue())
				.collect(Collectors.toList());
		
		System.out.println(sorted);
		

	}

}
