package stringReverse;

import java.util.Stack;

public class UsingStack {
	
	public static String reverseUsingStack(String word) {
		Stack<Character> stack = new Stack<>();
		String result = "";
		
		for(char c : word.toCharArray()) {
			stack.push(c);
		}
		
		while(!stack.isEmpty()) {
			result += String.valueOf(stack.pop());
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String word = "Hello World!";
		System.out.println(reverseUsingStack(word));

	}

}
