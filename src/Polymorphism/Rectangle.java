package Polymorphism;

public class Rectangle extends Shape{
	double length, width;
	
	Rectangle(double l, double w){
		length = l;
		width = w;
	}
	
	double area() {
		return length * width;
	}
	
	double perimeter() {
		return 2 * (length + width);
	}
}
