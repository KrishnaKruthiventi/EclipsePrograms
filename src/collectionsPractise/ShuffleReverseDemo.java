package collectionsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleReverseDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		
		Collections.shuffle(numbers);
		System.out.println("Shuffled: " + numbers);
		
		Collections.reverse(numbers);
		System.out.println("Reversed: " + numbers);

	}

}
