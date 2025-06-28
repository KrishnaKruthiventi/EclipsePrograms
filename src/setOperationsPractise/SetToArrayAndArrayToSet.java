package setOperationsPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToArrayAndArrayToSet {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		List<Integer> list = new ArrayList<>(set1);
		Integer[] arr = new Integer[list.size()];
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.getClass().getSimpleName());
		
		Set<Integer> set2 = new HashSet<>(Arrays.asList(arr));
		System.out.println(set2);
		System.out.println(set2.getClass().getSimpleName());
		
	}

}
