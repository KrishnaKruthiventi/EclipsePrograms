package Abstraction;

public class Duck implements Flyable, Swimmable{
	
	public void fly() {
		System.out.println("Duck is flying");
	}
	
	public void swim() {
		System.out.println("Duck is swimming");
	}
	
	public void walk() {
		System.out.println("Duck is walking");
	}
	
	public void quack() {
		System.out.println("Duck is quacking");
	}
}
