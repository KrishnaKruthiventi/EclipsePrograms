package stringReverse;

public class UsingRecursion {
	
	public static String reverseUsingRecursion(String word) {
		if(word.isEmpty()) {
			return "";
		}
		
		return reverseUsingRecursion(word.substring(1)) + word.charAt(0);
	}

	public static void main(String[] args) {
		
		String word = "Hello World!";
		System.out.println(reverseUsingRecursion(word));

	}

}
