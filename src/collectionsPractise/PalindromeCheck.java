package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeCheck {
	
	public static boolean hasPalindrome(ArrayList<String> list) {
		for(String word: list) {
			String reversed = new StringBuilder(word).reverse().toString();
			if(word.equalsIgnoreCase(reversed)) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "world", "madam", "java"));
		System.out.println(hasPalindrome(words));

	}

}
