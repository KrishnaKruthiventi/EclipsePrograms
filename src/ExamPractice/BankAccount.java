package ExamPractice;

import java.util.Scanner;

public class BankAccount {
	
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private String password;
	Scanner sc = new Scanner(System.in);
	
	BankAccount(String accountNumber, String accountHolder, String password){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.password = password;
		this.balance = 0;
	}
	
	public boolean authenticatePassword(String password) {
		return this.password.equals(password);
	}
	
	public double getBalance(String password) {
		if(authenticatePassword(password)) return balance;
		else System.out.println("Incorrect password. Try again");
		return -1;
	}
	
	public void deposit(double amount, String password) {
		if(authenticatePassword(password) && amount > 0) {
			balance += amount;
			System.out.println("Amount deposited successfully. Do you want to check balance?");
			char c = sc.nextLine().charAt(0);
			c = Character.toLowerCase(c);
			switch(c) {
			case 'y':
				System.out.println(getBalance(password));
				break;
			case 'n':
				System.out.println("Thank you!! Visit again.");
				break;
			}
		}
		else System.out.println("Authentication failed. Cant deposit amount");
	}
	
	public void withdraw(double amount, String password) {
		if(authenticatePassword(password)) {
			if(amount <= balance && amount > 0) {
				balance -= amount;
				System.out.println("You have withdrawn " + amount + " amount from your account. Do you want to check balance?");
				char c = sc.nextLine().charAt(0);
				c = Character.toLowerCase(c);
				switch(c) {
				case 'y':
					System.out.println(getBalance(password));
					break;
				case 'n':
					System.out.println("Thank you!! Visit again.");
					break;
				}
			}
		}
		else System.out.println("Authentication failed. Cant withdraw amount");
	}

	public static void main(String[] args) {
		BankAccount accHold1 = new BankAccount("12345678", "Krishna", "password123");
		
		System.out.println(accHold1.getBalance("password123"));
		accHold1.deposit(1000, "password");
		accHold1.deposit(1000, "password123");
		accHold1.withdraw(200, "password");
		accHold1.withdraw(200, "password123");
		accHold1.deposit(1000, "password123");
	}

}
