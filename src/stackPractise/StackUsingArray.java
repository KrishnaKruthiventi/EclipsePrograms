package stackPractise;

public class StackUsingArray {
	
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public StackUsingArray(int size) {
		this.maxSize = size;
		this.stackArray = new int[maxSize];
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize - 1;
	}
	
	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack overflow");
			return;
		}
		
		stackArray[++top] = value;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return - 1;
		}
		
		return stackArray[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		
		return stackArray[top];
	}
	
	public int size() {
		return top + 1;
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("Stack Empty");
			return;
		}
		
		for(int i = top; i >= 0; i--) {
			System.out.print(stackArray[i] + " ");
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
		stack.printStack();
		System.out.println("Peek: " + stack.peek());
		stack.printStack();
	}
	
}
