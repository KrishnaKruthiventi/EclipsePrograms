package Encapsulation;

public class BankAccount {
	
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private String password;
	
	public BankAccount(String accountNumber, String accountHolder,String password) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.password = password;
		this.balance = 0.0;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public double getBalance(String inputPassword) {
		if(authenticate(inputPassword)) return balance;
		System.out.println("Authentication Failed");
		return -1;
	}
	
	public void deposit(double amount, String inputPassword) {
		if(amount > 0 && authenticate(inputPassword)) { 
			balance += amount;
		    System.out.println("Deposit successful. New balance: " + balance);
		} else System.out.println("Invalid deposit amount or incorrect password");
	}
	
	public void withdraw(double amount, String inputPassword) {
		if(!authenticate(inputPassword)) {
			System.out.println("Authentication Failed");
			return;
		}
		
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. New Balance: " + balance);
		} else System.out.println("Invalid withdrawal amount or insufficient funds");
	}
	
	private boolean authenticate(String inputPassword) {
		return password.equals(inputPassword);
	}
}
