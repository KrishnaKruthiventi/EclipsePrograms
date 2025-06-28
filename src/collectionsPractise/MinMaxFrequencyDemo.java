package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxFrequencyDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5));
		
		int min = Collections.min(numbers);
		int max = Collections.max(numbers);
		System.out.println("Min: " + min + ", Max: " + max);
		
		int freq = Collections.frequency(numbers, 5);
		System.out.println("Frequency of 5: " + freq);

	}

}
