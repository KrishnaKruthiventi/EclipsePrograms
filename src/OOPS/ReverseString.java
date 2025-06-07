package OOPS;

public class ReverseString {
	
	public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		
		return reversed.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reverse of 'hello': " + reverseString("hello"));
		System.out.println("Reverse of 'Java': " + reverseString("Java"));

	}

}
