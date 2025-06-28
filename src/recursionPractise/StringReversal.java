package recursionPractise;

public class StringReversal {
	
	public static String reverseString(String str) {
		if(str.isEmpty()) return str;
		return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {
		
		String original = "Hello World";
		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reverseString(original));

	}

}
