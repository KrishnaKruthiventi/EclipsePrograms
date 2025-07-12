package stringReverse;

public class UsingBytes {
	
	public static String reverseUsingBytes(String word) {
		byte[] arr = word.getBytes();
		int left = 0;
		int right = word.length() - 1;
		
		while(left < right) {
			byte temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		return new String(arr);
	}

	public static void main(String[] args) {
		
		String word = "Hello World!";
		System.out.println(reverseUsingBytes(word));

	}

}
