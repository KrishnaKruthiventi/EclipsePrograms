package arrayListPractise;

import java.util.ArrayList;
import java.util.Collections;

public class BasicArrayListOperations {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		System.out.println("Initial list: " + fruits);
		
		fruits.add(1, "Mango");
		System.out.println("After insertion: " + fruits);
		
		System.out.println("Element at index 2: " + fruits.get(2));
		
		fruits.set(0, "Pineapple");
		System.out.println("After update: " + fruits);
		
		fruits.remove("Banana");
		fruits.remove(0);
		System.out.println("After removal: " + fruits);
		
		System.out.println("Contains Orange? " + fruits.contains("Orange"));
		
		System.out.println("Size of list: " + fruits.size());
		
		Collections.sort(fruits);
		System.out.println("Sorted list: " + fruits);
		
		fruits.clear();
		System.out.println("After clear: " + fruits + ", is empty? " + fruits.isEmpty());
	}

}
