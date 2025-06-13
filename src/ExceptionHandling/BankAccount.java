package ExceptionHandling;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws IllegalArgumentException, InsufficientFundsException {
		if(amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be positive");
		if(amount > balance) throw new InsufficientFundsException("Insufficient funds for withdrawal");
		balance -= amount;
		System.out.println("Withdrawal successful. New balance: " + balance);
	}
	
	public void deposit(double amount) throws IllegalArgumentException{
		if(amount < 0) throw new IllegalArgumentException("Deposit amount cannot be negative");
		balance += amount;
		System.out.println("Deposit successful. New balance: " + balance);
	}
}
