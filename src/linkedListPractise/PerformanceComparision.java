package linkedListPractise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceComparision {
	
	static final int SIZE = 100000;
	
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		long start = System.currentTimeMillis();
		for(int i = 0; i < SIZE; i++) {
			arrayList.add(0, i);
		}
		System.out.println("ArrayList insert at beginning: " + (System.currentTimeMillis() - start) + "ms");
		
		List<Integer> linkedlist = new LinkedList<>();
		start = System.currentTimeMillis();
		for(int i = 0; i < SIZE; i++) {
			linkedlist.add(0, i);
		}
		System.out.println("LinkedList insert at beginning: " + (System.currentTimeMillis() - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i = 0; i < SIZE; i += 1000) {
			arrayList.get(i);
		}
		System.out.println("ArrayList random access: " + (System.currentTimeMillis() - start) + "ms");
		
		start = System.currentTimeMillis();
		for(int i = 0; i < SIZE; i += 1000) {
			linkedlist.get(i);
		}
		System.out.println("LinkedList random access: " + (System.currentTimeMillis() - start) + "ms");
	}

}
