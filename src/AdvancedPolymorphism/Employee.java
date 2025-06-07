package AdvancedPolymorphism;

public class Employee {
	private String name;
	private double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	double calculateBonus() {
		return salary * 0.1;
	}
}
