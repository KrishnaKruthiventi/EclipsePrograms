package queuePractiseWithArraysAndLinkedLists;

public class QueueUsingLinkedList {
	
	Node front;
	Node rear;
	int size = 0;
	
	public QueueUsingLinkedList() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		int value = front.data;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		size--;
		
		return value;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		
		if(rear == null) {
			front = rear = newNode;
			size++;
			return;
		}
		
		rear.next = newNode;
		rear = newNode;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		Node current = front;
		
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.printQueue();
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.printQueue();
		System.out.println(queue.getSize());
		
		queue.dequeue();
		queue.printQueue();
		queue.dequeue();
		queue.dequeue();
		
		queue.enqueue(60);
		queue.enqueue(70);
		queue.printQueue();
		
	}
}
