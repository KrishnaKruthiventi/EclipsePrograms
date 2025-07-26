package reverseLinkedList;

public class UsingIterativeApproach {
	
	public static Node reverseIterative(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		
		Node reverse = reverseIterative(head);
		while(reverse != null) {
			System.out.print(reverse.data + " ");
			reverse = reverse.next;
		}

	}

}
