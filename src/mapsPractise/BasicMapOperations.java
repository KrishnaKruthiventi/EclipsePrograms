package mapsPractise;

import java.util.HashMap;
import java.util.Map;

public class BasicMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> ageMap = new HashMap<>();
		ageMap.put("Alice", 25);
		ageMap.put("Bob", 30);
		ageMap.put("Charlie", 35);
		
		System.out.println("Alice's age: " + ageMap.get("Alice"));
		System.out.println("Unknown key: " + ageMap.get("David"));
		
		System.out.println("Contains key 'Bob': " + ageMap.containsKey("Bob"));
		
		System.out.println("Contains value 30: " + ageMap.containsValue(30));
		
		ageMap.remove("Charlie");
		System.out.println("After removal: " + ageMap);
		
		System.out.println("Size: " + ageMap.size());
		System.out.println("Is empty: " + ageMap.isEmpty());
	}

}
