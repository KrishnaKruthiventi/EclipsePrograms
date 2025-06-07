package OOPS;

public class Rectangle {
	
	double length;
	double width;
	
	public Rectangle() {
		this.length = 1.0;
		this.width = 1.0;
	}
	
	public Rectangle(double side) {
		this.length = side;
		this.width = side;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateArea() {
		return this.length * this.width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(5.0);
		Rectangle rect3 = new Rectangle(4.0, 6.0);
		
		System.out.println("Area 1: " + rect1.calculateArea());
		System.out.println("Area 2: " + rect2.calculateArea());
		System.out.println("Area 3: " + rect3.calculateArea());
	}

}
