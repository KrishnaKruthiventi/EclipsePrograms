package queuePractiseWithArraysAndLinkedLists;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(10);
		queue.offer(20);
		
		System.out.println("Front element: " + queue.peek());
		
		System.out.println("Removed: " + queue.remove());
		System.out.println("Removed: " + queue.poll());
		
		System.out.println("Is queue empty? " + queue.isEmpty());
	}

}
