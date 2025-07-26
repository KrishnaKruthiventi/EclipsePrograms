package hashMapPractise;

import java.util.HashMap;

public class WordFrequency {

	public static void main(String[] args) {
		
		String sentence = "hello world hello java world";
		String[] words = sentence.split(" ");
		
		HashMap<String, Integer> freq = new HashMap<>();
		
		for(String word: words) {
			freq.put(word, freq.getOrDefault(word, 0) + 1);
		}
		
		System.out.println(freq);
	}

}
