package applicationPrograms;

public class EmailValidator {
	
	public static boolean isValidEmail(String email) {
		String regex = 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] emails = {
			"test@example.com",
			"invalid.email",
			"another.test@domain.co.uk",
			"wrong@.com"
		};
		
		for(String email : emails) {
			System.out.println(email + " is valid? " + isValidEmail(email));
		}

	}

}
