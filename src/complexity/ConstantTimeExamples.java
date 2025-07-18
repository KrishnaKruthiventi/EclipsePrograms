package complexity;

import java.util.HashMap;
import java.util.Map;

public class ConstantTimeExamples {
	
	public static int getElement(int[] arr, int index) {
		return arr[index];
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static void hashMapLookup() {
		Map<String, Integer> map = new HashMap<>();
		map.put("key", 42);
		int value = map.get("key");
		System.out.println("Value: " + value);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Element at index 2: " + getElement(arr, 2));
		System.out.println("Sum: " + add(5, 7));
		hashMapLookup();
	}
}
