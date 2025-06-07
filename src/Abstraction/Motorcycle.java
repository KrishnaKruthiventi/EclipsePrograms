package Abstraction;

public class Motorcycle extends Vehicle{
	
	public Motorcycle(String model, int year) {
		super(model, year);
	}
	
	public void start() {
		System.out.println("Motorcycle is starting...");
	}
	
	public void stop() {
		System.out.println("Motorcycle is stopping...");
	}
}
