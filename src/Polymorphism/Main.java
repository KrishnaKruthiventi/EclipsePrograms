package Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		myAnimal.makeSound();
		myDog.makeSound();
		myCat.makeSound();
		
		
		Shape s1 = new Circle(5);
		Shape s2 = new Rectangle(4, 6);
		
		System.out.println("Circle Area: " + s1.area());
		System.out.println("Circle Perimeter: " + s1.perimeter());
		
		System.out.println("Rectangle Area: " + s2.area());
		System.out.println("Rectangle Perimeter: " + s2.perimeter());
		
		Payment payment = new CreditCardPayment();
		payment.pay(100.0);
		
		payment = new PayPalPayment();
		payment.pay(200.0);
		
		payment = new BankTransferPayment();
		payment.pay(300.0);
	}

}
