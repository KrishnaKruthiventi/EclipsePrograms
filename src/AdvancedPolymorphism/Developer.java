package AdvancedPolymorphism;

public class Developer extends Employee{
	
	Developer(String name, double salary){
		super(name, salary);
	}
	
	double calculateBonus() {
		return super.calculateBonus() + 300;
	}
}
