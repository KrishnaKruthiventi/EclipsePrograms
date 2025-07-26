package reverseLinkedList;

public class UsingRecursiveApproach {
	
	public static Node reverseRecursive(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		
		return newHead;
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		
		Node reverse = reverseRecursive(head);
		while(reverse != null) {
			System.out.print(reverse.data + " ");
			reverse = reverse.next;
		}

	}

}
