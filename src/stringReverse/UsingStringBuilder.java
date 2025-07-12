package stringReverse;

public class UsingStringBuilder {
	
	public static String reverseUsingStringBuilder(String word) {
		return new StringBuilder(word).reverse().toString();
	}

	public static void main(String[] args) {
		
		String word = "Hello World!";
		System.out.println(reverseUsingStringBuilder(word));
	}

}
