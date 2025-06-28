package mapsPractise;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> insertionOrderMap = new LinkedHashMap<>();
		insertionOrderMap.put("First", 1);
		insertionOrderMap.put("Third", 3);
		insertionOrderMap.put("Second", 2);
		insertionOrderMap.put("Fourth", 4);
		
		System.out.println("Insertion order maintained:");
		insertionOrderMap.forEach((k, v) -> System.out.println(k + " : " + v));
		
		Map<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
		accessOrderMap.put("One", 1);
		accessOrderMap.put("Two", 2);
		accessOrderMap.put("Three", 3);
		
		System.out.println(accessOrderMap.get("Two"));
		System.out.println(accessOrderMap.get("One"));
		
		System.out.println("\nAccess order (most recently accessed last):");
		accessOrderMap.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}
