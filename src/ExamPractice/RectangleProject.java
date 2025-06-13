package ExamPractice;

public class RectangleProject {
	
	private double height;
	private double width;
	
	public RectangleProject(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return this.height * this.width;
	}
	
	public double getPerimeter() {
		return 2 * (this.height + this.width);
	}
	
	public void isSquare() {
		if(this.height == this.width) System.out.println("This is square");
		else System.out.println("This is recatangle");
	}

	public static void main(String[] args) {
		RectangleProject rect = new RectangleProject(5.0, 6.5);
		
		System.out.println(rect.getArea());
		System.out.println(rect.getPerimeter());
		rect.isSquare();

	}

}
