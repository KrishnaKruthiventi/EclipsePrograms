package reverseLinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class UsingLinkedList {
	
	public static LinkedList<Integer> reverseUsingCollections(LinkedList<Integer> list){
		LinkedList<Integer> copy = new LinkedList<>(list);
		Collections.reverse(copy);
		return copy;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		LinkedList<Integer> reverse = reverseUsingCollections(list);
		System.out.println(reverse);
	}

}
