package Abstraction;

public class Car extends Vehicle{
	
	public Car(String model, int year) {
		super(model, year);
	}
	
	public void start() {
		System.out.println("Car is starting...");
	}
	
	public void stop() {
		System.out.println("Car is stopping...");
	}
}
