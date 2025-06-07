package Polymorphism;

public class Circle extends Shape{
	double radius;
	
	Circle(double r){
		radius = r;
	}
	
	double area() {
		return Math.PI * radius * radius;
	}
	
	double perimeter() {
		return 2 * Math.PI * radius;
	}
}
