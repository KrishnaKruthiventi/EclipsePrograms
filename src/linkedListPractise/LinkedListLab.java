package linkedListPractise;

import java.util.LinkedList;

public class LinkedListLab {

	public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("Paris");
		cities.add("London");
		cities.add("Tokyo");
		System.out.println("Initial list: " + cities);
		
		cities.addFirst("New York");
		cities.addLast("Sydney");
		System.out.println("After additions: " + cities);
		
		System.out.println("First city: " + cities.getFirst());
		System.out.println("Last city: " + cities.getLast());
		
		cities.removeFirst();
		cities.removeLast();
		System.out.println("After removals: " + cities);
		
		cities.offer("Berlin");
		System.out.println("After offer: " + cities);
		System.out.println("Peek (first element): " + cities.peek());
		System.out.println("Poll (remove and return first): " + cities.poll());
		System.out.println("After poll: " + cities);
		
		cities.push("Rome");
		System.out.println("After push: " + cities);
		System.out.println("Pop (remove and return first): " + cities.pop());
		System.out.println("After pop: " + cities);
	}

}
