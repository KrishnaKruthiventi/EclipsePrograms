package setOperationsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		Integer[] numbers = {1, 2, 3, 4, 3, 2, 5, 1};
		List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbers));
		Set<Integer> set = new HashSet<>(numbersList);
		
		for(Integer num : set) {
			numbersList.remove(num);
		}
		
		Collections.sort(numbersList);
		System.out.println(numbersList);
	}

}
