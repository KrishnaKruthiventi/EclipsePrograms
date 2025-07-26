package hashMapPractise;

import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		
		String str = "aabbccddee";
		LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();
		
		for(char c : str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		
		for(char c : freq.keySet()) {
			if(freq.get(c) == 1) {
				System.out.println("First non-repeating: " + c);
				return;
			}
		}
		
		System.out.println("No non- repeating characters");

	}

}
