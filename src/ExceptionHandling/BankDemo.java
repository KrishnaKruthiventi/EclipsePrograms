package ExceptionHandling;

public class BankDemo {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		
		try {
			account.withdraw(1500);
		} catch(IllegalArgumentException | InsufficientFundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			account.withdraw(-100);
		} catch(IllegalArgumentException | InsufficientFundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			account.withdraw(500);
		} catch(IllegalArgumentException | InsufficientFundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			account.deposit(-100);
		} catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			account.deposit(500);
		} catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
