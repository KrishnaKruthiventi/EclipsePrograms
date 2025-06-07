package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		myDog.eat();
		myDog.bark();
		
		Bike obj = new Bike();
		obj.run();
		
		Child childObj = new Child();
		childObj.grandParentMethod();
		childObj.parentMethod();
		childObj.childMethod();
		
		Shape s1 = new Circle();
		Shape s2 = new Square();
		s1.draw();
		s2.draw();
		
		Student s = new Student("Alice", 101);
		s.display();
		
		Bank b1 = new SBI();
		Bank b2 = new PNB();
		
		System.out.println("SBI Rate: " + b1.getRateOfInterest() + "%");
		System.out.println("PNB Rate: " + b2.getRateOfInterest() + "%");
		
		Parrot p = new Parrot();
		p.eat();
		p.fly();
		p.speak();
	}

}
