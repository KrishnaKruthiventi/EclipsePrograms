package applicationPrograms;

public class LongestWord {
	
	public static String findLongestWord(String sentence) {
		String[] words = sentence.split(" ");
		String longest = "";
		int len = 0;
		
		for(String word: words) {
			int length = word.length();
			if(length > len) {
				len = length;
				longest = word;
			}
			
		}
		
		return longest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "The quick brown fox jumps over the lazy dog";
		System.out.println("Longest word: " + findLongestWord(text));
	}

}
