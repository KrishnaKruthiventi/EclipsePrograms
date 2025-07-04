package linkedList;

public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void insertAtBeginnning(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
	}
	
	public void insertAtPosition(int data, int position) {
		if(position < 0) {
			System.out.println("Invalid operation");
			return;
		}
		
		Node newNode = new Node(data);
		
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		Node current = head;
		
		for(int i = 0; i < position - 1 && current != null; i++) {
			current = current.next;
		}
		
		if(current == null) {
			System.out.println("Out of bound");
			return;
		}
		
		newNode.next = current.next;
		current.next = newNode;
	}
	
	public void deleteByValue(int data) {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		
		if(head.data == data) {
			head = head.next;
			return;
		}
		
		Node current = head;
		
		while(current.next != null && current.next.data != data) {
			current = current.next;
		}
		
		if(current.next != null) {
			current.next = current.next.next;
		}
	}
	
	public void deleteByPosition(int position) {
		if(head == null || position < 0) {
			System.out.println("Invalid condition");
			return;
		}
		
		if(position == 0) {
			head = head.next;
			return;
		}
		
		Node current = head;
		
		for(int i = 0; i < position - 1 && current != null; i++) {
			current = current.next;
		}
		
		if(current == null || current.next == null) {
			System.out.println("Position out of bounds");
			return;
		}
		
		current.next = current.next.next;
	}
	
	public boolean search(int data) {
		Node current = head;
		
		while(current.next != null) {
			if(current.data == data) {
				return true;
			}
			current = current.next;
		}
		
		return false;
	}
	
	public int getSize() {
		int count = 0;
		Node current = head;
		
		while(current.next  != null) {
			count++;
			current = current.next;
		}
		
		if(current.data != 0) count++;
		return count;
	}
	
	public void printList() {
		Node current = head;
		System.out.print(current.data + " -> ");
		while(current.next != null) {
			current = current.next;
			System.out.print(current.data + " -> ");
			
		}
		
		System.out.println("null");
	}
	
	public void removeNthFromEnd(int n) {
		Node dummy = new Node(n);
		dummy.next = head;
		Node fast = dummy, slow = dummy;
		
		for(int i = 0; i <= n; i++) {
			fast = fast.next;
		}
		
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
//		head = dummy.next;
	}
	
	public static Node mergeSortedLists(Node l1, Node l2) {
		Node dummy = new Node(0);
		Node tail = dummy;
		
		while(l1 != null && l2 != null) {
			if(l1.data <= l2.data) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail = tail.next;
		}
		
		while(l1 != null) {
			tail.next = l1;
			l1 = l1.next;
			tail = tail.next;
		}
		
		while(l2 != null) {
			tail.next = l2;
			l2 = l2.next;
			tail = tail.next;
		}
		
		
		return dummy.next;
		
	}
	
	public void rotate(int k) {
		if(head == null || k == 0) return;
		
		int len = 1;
		Node last = head;
		while(last.next != null) {
			last = last.next;
			len++;
		}
		
		k = k % len;
		if(k == 0) return;
		
		Node newLast = head;
		for(int i = 0; i < len - k - 1; i++) {
			newLast = newLast.next;
		}
		
		Node newHead = newLast.next;
		newLast.next = null;
		last.next = head;
		head = newHead;
	}

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insertAtBeginnning(1);
		list.insertAtBeginnning(0);
		list.insertAtPosition(2, 2);
		
		list.printList();
		
		list.insertAtEnd(3);
		list.printList();
		
		System.out.println(list.getSize());
		
		list.deleteByValue(2);
		list.printList();
		
		list.deleteByPosition(1);
		list.printList();
		
		list.insertAtEnd(4);
		list.insertAtEnd(5);
		list.insertAtEnd(6);
		list.insertAtEnd(7);
		list.insertAtEnd(8);
		list.insertAtPosition(1, 1);
		list.insertAtPosition(2, 2);
		list.printList();
		
		list.removeNthFromEnd(5);
		list.printList();
		
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		
		list1.insertAtBeginnning(8);
		list1.insertAtBeginnning(6);
		list1.insertAtBeginnning(5);
		list1.insertAtBeginnning(3);
		list1.printList();
		
		list2.insertAtBeginnning(10);
		list2.insertAtBeginnning(9);
		list2.insertAtBeginnning(7);
		list2.insertAtBeginnning(4);
		list2.insertAtBeginnning(2);
		list2.insertAtBeginnning(1);
		list2.printList();
		
		Node headNode = LinkedList.mergeSortedLists(list1.head, list2.head);
		LinkedList list3 = new LinkedList();
		list3.insertAtBeginnning(headNode);
		list3.printList();
		
		list3.rotate(5);
		list3.printList();
		
		
		
	}

	private void insertAtBeginnning(Node headNode) {
		head = headNode;
		
	}

}
