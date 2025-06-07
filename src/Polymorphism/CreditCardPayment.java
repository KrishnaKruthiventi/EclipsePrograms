package Polymorphism;

public class CreditCardPayment implements Payment{
	public void pay(double amount) {
		System.out.println("Paying " + amount + " via credit card");
	}
}
