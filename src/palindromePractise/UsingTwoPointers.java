package palindromePractise;

public class UsingTwoPointers {
	
	public static boolean isPalindrome(String word) {
		char[] arr = word.toCharArray();
		int left = 0;
		int right = word.length() - 1;
		boolean palindrome = true;
		
		while(left < right) {
			if(arr[left] != arr[right]) {
				palindrome = false;
				break;
			}
			left++;
			right--;
		}
		
		return palindrome;
	}

	public static void main(String[] args) {
		
		String word = "madam";
		System.out.println(isPalindrome(word));

	}

}
