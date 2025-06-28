package queuePractise;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeLab {

	public static void main(String[] args) {
		
		Deque<String> deque = new ArrayDeque<>();
		
		deque.addFirst("First");
		deque.addLast("Last");
		deque.offerFirst("New First");
		deque.offerLast("New Last");
		System.out.println("Deque: " + deque);
		
		System.out.println("First Element: " + deque.getFirst());
		System.out.println("Last Element: " + deque.getLast());
		System.out.println("Peek first: " + deque.peekFirst());
		System.out.println("Peek last: " + deque.peekLast());
		
		System.out.println("Removed first: " + deque.removeFirst());
		System.out.println("Removed last: " + deque.removeLast());
		System.out.println("Poll first: " + deque.pollFirst());
		System.out.println("Poll last: " + deque.pollLast());
		System.out.println("Deque after removal: " + deque);
		
		deque.push("Stack Element 1");
		deque.push("Stack Element 2");
		System.out.println("As stack: " + deque);
		System.out.println("Popped: " + deque.pop());
		System.out.println("As stack: " + deque);
	}

}
