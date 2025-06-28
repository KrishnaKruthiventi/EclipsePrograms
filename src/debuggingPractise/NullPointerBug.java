package debuggingPractise;

public class NullPointerBug {

	public static void main(String[] args) {
		
		String message = "Krishna";
		if(message.length() > 0) {
			System.out.println("Message is not empty");
		}

	}

}
