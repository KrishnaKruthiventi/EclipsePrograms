package AdvancedPolymorphism;

public class Manager extends Employee{
	
	Manager(String name, double salary){
		super(name, salary);
	}
	
	double calculateBonus() {
		return super.calculateBonus() + 500;
	}
}
