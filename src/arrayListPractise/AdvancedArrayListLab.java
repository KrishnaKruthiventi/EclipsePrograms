package arrayListPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AdvancedArrayListLab {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		
		System.out.println("Using for-each:");
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		
		System.out.println("\nUsing Iterator:");
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		List<Integer> subList = numbers.subList(1, 4);
		System.out.println("\nSubList (1-4): " + subList);
		
		Integer[] numbersArray = numbers.toArray(new Integer[0]);
		System.out.println("Array: " + Arrays.toString(numbersArray));
		
		numbers.removeIf(n -> n > 30);
		System.out.println("After removing >30: " + numbers);
		
		numbers.replaceAll(n -> n * 2);
		System.out.println("After doubling: " + numbers);
	}

}

