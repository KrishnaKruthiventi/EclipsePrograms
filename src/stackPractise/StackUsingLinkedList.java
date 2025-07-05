package stackPractise;

public class StackUsingLinkedList {

	Node top;
	int size;
	
	public StackUsingLinkedList() {
		this.top = null;
		this.size = 0;
	}
	
	public void push(int value) {
		Node newNode = new Node(value);
		
		newNode.next = top;
		top = newNode;
		size++;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		return size;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		
		int value = top.data;
		top = top.next;
		size--;
		
		return value;
	}
	
	public int peek() {
		
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		
		int value = top.data;
		
		return value;
	}
	
	public void printStack() {
		
		if(isEmpty()) {
			System.out.println("Satck is empty");
			return;
		}
		
		Node current = top;
		
		while(current != null) {
			System.out.print(top.data + " ");
			current = current.next;
		}
		
		System.out.println();
	}
	
public static void main(String[] args) {
		
		StackUsingArray stack = new StackUsingArray(5);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.printStack();
		
		System.out.println("Popped: " + stack.pop()); 
		stack.push(60);
		stack.printStack();
		System.out.println("Peek: " + stack.peek());
		stack.printStack();
	}
}
