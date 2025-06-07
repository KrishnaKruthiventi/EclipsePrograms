package AdvancedPolymorphism;

public class BonusCalculator {
	
	static void printBonus(Employee emp) {
		System.out.println("Bonus for " + emp.getClass().getSimpleName() + " : $" + emp.calculateBonus());
	}
}
