package reverseLinkedList;

import java.util.Stack;

public class UsingStack {
	
	public static Node reverseUsingStack(Node head) {
	
		Stack<Node> stack = new Stack<>();
		Node current = head;
		
		while(current != null) {
			stack.push(current);
			current = current.next;
		}
		
		Node newHead = stack.pop();
		current = newHead;
		
		while(!stack.isEmpty()) {
			current.next = stack.pop();
			current = current.next;
		}
		
		current.next = null;
		
		return newHead;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		
		Node reverse = reverseUsingStack(head);
		while(reverse != null) {
			System.out.print(reverse.data + " ");
			reverse = reverse.next;
		}
	}

}
