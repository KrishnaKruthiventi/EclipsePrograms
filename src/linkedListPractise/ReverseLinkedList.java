package linkedListPractise;

import java.util.LinkedList;


public class ReverseLinkedList {
	
	public static void reverseList(LinkedList<String> list) {
		int len = list.size();
		
		for(int i = 0; i < len / 2; i++) {
			String val = list.get(i);
			
			
		}
	}

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		
		reverseList(linkedList);
		System.out.println(linkedList);
	}

}
