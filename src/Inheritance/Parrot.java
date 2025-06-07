package Inheritance;

public class Parrot implements Animal1, Bird{
	public void eat() {
		System.out.println("Parrot eats fruits");
	}
	
	public void fly() {
		System.out.println("Parrot can fly");
	}
	
	void speak() {
		System.out.println("Parrot can mimic human speech");
	}
}
