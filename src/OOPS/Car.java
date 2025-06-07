package OOPS;

public class Car {
	
	String make;
	String model;
	int year;
	String color;
	
	public Car(String make, String model, int year, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	public Car(String make, String model, int year) {
		this(make, model, year, "Black");
	}
	
	public Car(String make, String model) {
		this(make, model, 2023);
	}
	
	public void displayInfo() {
		System.out.println(year + " " + make + " " + model + ", Color: " + color);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Toyota", "Camry", 2022, "Blue");
		Car car2 = new Car("Honda", "Accord", 2021);
		Car car3 = new Car("Ford", "Mustang");
		
		car1.displayInfo();
		car2.displayInfo();
		car3.displayInfo();
	}

}
