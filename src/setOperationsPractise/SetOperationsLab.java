package setOperationsPractise;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsLab {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("Union: " + union);
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection: " + intersection);
		
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println("Difference (set1 - set2): " + difference);
		
		Set<Integer> symmetricDiff = new HashSet<>(union);
		symmetricDiff.removeAll(intersection);
		System.out.println("Symmetric Difference: " + symmetricDiff);
		
		System.out.println("Is {3, 4} subset of set1? " + set1.containsAll(Set.of(3, 4)));
		
	}

}
