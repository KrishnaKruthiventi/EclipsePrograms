package ExceptionHandling;

public class ThrowExample {
	
	public static void checkAge(int age) throws UnderAgeException {
		if(age < 18) {
			throw new UnderAgeException("Access denied - You must be atleast 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) throws UnderAgeException {
		
		try {
			checkAge(15);
		} catch(UnderAgeException e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
		checkAge(20);
	}
}
