package setOperationsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWordsCounter {

	public static void main(String[] args) {
		
		String[] wordsArr = {"Apple", "Banana", "Orange", "Banana", "Apple"};
		List<String> words = new ArrayList<>(Arrays.asList(wordsArr));
		Set<String> wordsSet = new HashSet<>(words);
		int uniqueElements = 0;
		
		for(String word : wordsSet) {
			int count = Collections.frequency(words, word);
			if(count == 1) uniqueElements+=1;
		}
		
		System.out.println(uniqueElements);

	}

}
