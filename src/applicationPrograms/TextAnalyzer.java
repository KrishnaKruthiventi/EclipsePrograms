package applicationPrograms;
import java.util.*;

public class TextAnalyzer {
	
	public static void countWords(String sampleText) {
		String[] wordsArr = sampleText.split(" ");
		System.out.println("TotalWords: " + wordsArr.length);
		
	}
	
	public static void characterFrequency(String text) {
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		for(char c : text.toCharArray()) {
			hmap.put(c, hmap.getOrDefault(c,  0) + 1);
		}
		
		System.out.println("Character frequencies:");
		for(Map.Entry<Character, Integer> entry: hmap.entrySet()) {
			System.out.println(entry.getKey()+ ": " + entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sampleText = "Hello World! This is a sample text for analysis.";
		
		countWords(sampleText);
		characterFrequency(sampleText);
	}
}
