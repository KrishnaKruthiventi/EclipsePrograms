package debuggingPractise;

public class StringCompareBug {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		
		if(s1.equals(s2)) {
			System.out.println("Strings match");
		} else {
			System.out.println("Strings dont match");
		}

	}

}
