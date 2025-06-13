package ExceptionHandling;

public class RethrowExample {
	
	public static void processInput(String input) throws NumberFormatException{
		try {
			int number = Integer.parseInt(input);
			System.out.println("Sqaure of " + number + " is " + (number * number));
		} catch(NumberFormatException e) {
			System.out.println("First attempt failed - trying alternative...");
			try {
				double number = Double.parseDouble(input);
				System.out.println("Square of " + number + " is "+ (number * number));
			} catch(NumberFormatException e2) {
				System.out.println("Second attempt failed - giving up");
				throw e;
			}
		}
	}

	public static void main(String[] args) {
		
		try {
			processInput("123");
			processInput("abc");
		} catch(NumberFormatException e) {
			System.out.println("Final error: Input must be a valid integer");
		}

	}

}
