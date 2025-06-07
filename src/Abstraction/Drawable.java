package Abstraction;

public interface Drawable {
	
	void draw();
	
	default void printInfo() {
		System.out.println("This is a drawable object");
	}
}
