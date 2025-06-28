package queuePractise;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeVersatilityLab {

	public static void main(String[] args) {
		
		Deque<String> stack = new ArrayDeque<>();
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		
		System.out.println("Stack behaviour: ");
		while(!stack.isEmpty()) {
			System.out.println("Popped: " + stack.pop());
		}
		
		Deque<String> queue = new ArrayDeque<>();
		queue.offer("First");
		queue.offer("Second");
		queue.offer("Third");
		
		System.out.println("\nQueue behaviour:");
		while(!queue.isEmpty()) {
			System.out.println("Polled: " + queue.poll());
		}
		
		Deque<String> hybrid = new ArrayDeque<>();
		hybrid.addFirst("Front 1");
		hybrid.addLast("Rear 1");
		hybrid.push("Front 2");
		hybrid.offer("Rear 2");
		
		System.out.println("\nHybrid: " + hybrid);
		System.out.println("Hybrid behaviour:");
		System.out.println("As stack - pop: " + hybrid.pop());
		System.out.println("As queue - poll: " + hybrid.poll());
		System.out.println("Remaining: " + hybrid);
	}

}
