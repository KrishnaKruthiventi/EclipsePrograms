package hashMapPractise;

import java.util.HashMap;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		String str = "hello world";
		HashMap<Character, Integer> freq = new HashMap<>();
		
		for(char c: str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}
		
		System.out.println(freq);
	}

}
