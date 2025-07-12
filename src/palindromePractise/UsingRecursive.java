package palindromePractise;

public class UsingRecursive {
	
	public static boolean isPalindrome(String word) {
		boolean result = false;
		
		if(word.length() == 1 || word.length() == 0) result = true;
		
		if(word.charAt(0) == word.charAt(word.length() - 1)) result =  true;
		else result = false;
		
		if(word.length() > 2) {
			isPalindrome(word.substring(1, word.length() - 1));
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String word = "1232";
		System.out.println(isPalindrome(word));

	}

}
