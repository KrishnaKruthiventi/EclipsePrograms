package queuePractiseWithArraysAndLinkedLists;

public class QueueUsingArrays {
	
	private int maxsize;
	private int[] queueArray;
	private int start;
	private int end;
	
	public QueueUsingArrays(int size) {
		this.maxsize = size;
		queueArray = new int[maxsize];
		start = -1;
		end = -1;
	}
	
	public boolean isEmpty() {
		return end == -1;
	}
	
	public boolean isFull() {
		return end == maxsize - 1;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full cannot enter");
			return;
		}
		
		if(isEmpty()) {
			start = 0;
			end = 0;
			queueArray[start] = data;
		}
		else {
			queueArray[++end] = data;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty nothing to pull out");
			return -1;
		}
		
		int data = queueArray[0];
		
		for(int i = 0; i < end; i++) {
			queueArray[i] = queueArray[i+1];
		}
		queueArray[end] = 0;
		end--;
		
		return data;
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		for(int i = start; i <= end; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		QueueUsingArrays queue = new QueueUsingArrays(5);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.printQueue();
		
		queue.dequeue();
		queue.dequeue();
		queue.printQueue();
		
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(60);
		queue.enqueue(70);
		queue.enqueue(80);
		queue.printQueue();
		
		queue.dequeue();
		queue.printQueue();
	}
}
