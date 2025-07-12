package stringReverse;

public class UsingTwoPointers {
	
	public static String reverseUsingTwoPointers(String word) {
		char[] arr = word.toCharArray();
		int left = 0;
		int right = word.length() - 1;
		
		while(left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		
		return new String(arr);
	}

	public static void main(String[] args) {
		
		String word = "Hello World!";
		System.out.println(reverseUsingTwoPointers(word));
	}

}
