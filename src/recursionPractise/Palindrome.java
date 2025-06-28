package recursionPractise;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		if(str.length() <= 1) return true;
		if(str.charAt(0) != str.charAt(str.length() - 1)) return false;
		return isPalindrome(str.substring(1, str.length() - 1));
	}

	public static void main(String[] args) {
		
		String test1 = "madam";
		String test2 = "hello";
		System.out.println(test1 + " is palindrome? " + isPalindrome(test1));
		System.out.println(test2 + " is palindrome? " + isPalindrome(test2));

	}

}
