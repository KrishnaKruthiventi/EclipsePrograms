package hashMapPractise;

import java.util.HashMap;

public class Basics {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<>();
		
		hmap.put("Alice", 25);
		hmap.put("Bob", 35);
		hmap.put("Charlie", 25);
		
		System.out.println("Bob's age: " + hmap.get("Bob"));
		System.out.println("Contains Alice? " + hmap.containsKey("Alice"));
		
		hmap.remove("Charlie");
		System.out.println("Size after removal: " + hmap.size());

	}

}
