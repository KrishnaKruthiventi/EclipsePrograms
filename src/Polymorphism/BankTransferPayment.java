package Polymorphism;

public class BankTransferPayment implements Payment{
	public void pay(double amount) {
		System.out.println("Paying " + amount + " via Bank Transfer");
	}
}
