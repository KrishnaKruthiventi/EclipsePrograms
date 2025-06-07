package Abstraction;

public class Main {

	public static void main(String[] args) {
		
//		Animal dog = new Dog();
//		Animal cat = new Cat();
//		
//		dog.makeSound();
//		dog.eat();
//		cat.makeSound();
//		cat.eat();
		
//		Drawable circle = new Circle();
//		Drawable rectangle = new Rectangle();
//		
//		circle.draw();
//		circle.printInfo();
//		
//		rectangle.draw();
//		rectangle.printInfo();
		
//		Vehicle car = new Car("Toyota Camry", 2022);
//		Vehicle bike = new Motorcycle("Harley Davidson", 2021);
//		
//		car.displayInfo();
//		car.start();
//		car.stop();
//		
//		bike.displayInfo();
//		bike.start();
//		bike.stop();
		
		Duck duck = new Duck();
		duck.fly();
		duck.swim();
		duck.quack();
		
		Flyable flyingObject = duck;
		flyingObject.fly();
		
		Swimmable swimmingObject = duck;
		swimmingObject.swim();
	}

}
