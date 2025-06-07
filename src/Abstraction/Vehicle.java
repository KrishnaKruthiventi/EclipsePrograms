package Abstraction;

public abstract class Vehicle {
	private String model;
	private int year;
	
	public Vehicle(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	public abstract void start();
	public abstract void stop();
	
	public void displayInfo() {
		System.out.println("Model: " + model + ", Year: " + year);
	}
}
