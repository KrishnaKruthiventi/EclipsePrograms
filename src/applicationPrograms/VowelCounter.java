package applicationPrograms;

public class VowelCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Hello World! Programming is fun.";
		int vowels = 0, consonants = 0;
		
		text = text.toLowerCase();
		
		for(int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
				else consonants++;
			}
		}
		
		System.out.println("Vowels count: " + vowels);
		System.out.println("Consonants count: " + consonants);
		
	}

}
