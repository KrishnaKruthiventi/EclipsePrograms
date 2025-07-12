package stringReverse;

public class IterativeApproach {
	
	public static String stringReversalUsingCharArray(String word) {
		
		char[] arr = word.toCharArray();
		String result = "";
		
		for(int i = arr.length - 1; i >= 0; i--) {
			result += String.valueOf(arr[i]);
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String word = "Hello World!";
		
		System.out.println(stringReversalUsingCharArray(word));

	}

}
