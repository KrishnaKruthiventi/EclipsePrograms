package setOperationsPractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementationsLab {

	public static void main(String[] args) {
		
		String[] colors = {"Red", "Green", "Blue", "Yellow", "Orange", "Red", "Blue"};
		
		Set<String> hashSet = new HashSet<>(Arrays.asList(colors));
		System.out.println("Hashset: " + hashSet);
		
		Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(colors));
		System.out.println("LinkedHashSet: " + linkedHashSet);
		
		Set<String> treeSet = new TreeSet<>(Arrays.asList(colors));
		System.out.println("TreeSet: " + treeSet);
		
		long start = System.nanoTime();
		hashSet.contains("Orange");
		long end = System.nanoTime();
		System.out.println("HashSet lookup time: " + (end - start) + "ms");
		
		start = System.nanoTime();
		linkedHashSet.contains("Orange");
		end = System.nanoTime();
		System.out.println("LinkedHashSet lookup time: " + (end - start) + "ms");
		
		start = System.nanoTime();
		treeSet.contains("Orange");
		end = System.nanoTime();
		System.out.println("TreeSet lookup time: " + (end - start) + "ms");

	}

}
