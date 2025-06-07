package AdvancedPolymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] animals = new Animal[4];
		
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
		animals[3] = new Lion();
		
		for(Animal animal : animals) {
			animal.makeSound();
		}
		
		Employee emp1 = new Employee("John", 50000);
		Employee emp2 = new Manager("Alice", 80000);
		Employee emp3 = new Developer("Bob", 60000);
		
		BonusCalculator.printBonus(emp1);
		BonusCalculator.printBonus(emp2);
		BonusCalculator.printBonus(emp3);
	}

}
