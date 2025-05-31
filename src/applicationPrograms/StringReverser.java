package applicationPrograms;

public class StringReverser {
	
	public static String reverseWithStringBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public static String reverseWithCharArray(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		
		while(left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		
		return new String(charArray);
	}
	
	public static String reverseRecursively(String str) {
		if(str.isEmpty()) return str;
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "Hello World";
		
		System.out.println("Original: " + original);
		System.out.println("Reversed (StringBuilder): " + reverseWithStringBuilder(original));
		System.out.println("Reversed (CharArray): " + reverseWithCharArray(original));
		System.out.println("Reversed (Recursive): " + reverseRecursively(original));
	}

}
