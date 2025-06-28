package setOperationsPractise;

import java.util.HashSet;
import java.util.Set;

public class CommonInThreeSets {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> set3 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(2);
		set2.add(4);
		
		set3.add(3);
		set3.add(5);
		set3.add(1);
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		intersection.retainAll(set3);
		
		System.out.println(intersection);
	}

}
