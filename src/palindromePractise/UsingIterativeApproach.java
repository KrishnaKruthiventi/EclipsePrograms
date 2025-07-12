package palindromePractise;

public class UsingIterativeApproach {
	
	public static boolean isPalindrome(String word) {
		String rev = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			rev += word.charAt(i);
		}
		
		return word.equals(rev);
	}

	public static void main(String[] args) {
		
		String word = "madam";
		System.out.println(isPalindrome(word));
	}

}
