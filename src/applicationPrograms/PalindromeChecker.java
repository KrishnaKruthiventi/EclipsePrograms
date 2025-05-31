package applicationPrograms;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madams";
		boolean isPalindrome = true;
		
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println(str + " is " + (isPalindrome ? "" : "not ") + "a palindrome");

	}

}
