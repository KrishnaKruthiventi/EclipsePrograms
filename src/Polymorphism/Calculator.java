package Polymorphism;
// Method Overloading (Compile time polymorphism)
public class Calculator {
	int add(int a, int b) {
		return a + b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	double add(double a, double b) {
		return a + b;
	}
	
	String add(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		System.out.println("10 + 20 = " + calc.add(10, 20));
		System.out.println("10 + 20 + 30 = " + calc.add(10, 20, 30));
		System.out.println("5.5 + 4.5 = " + calc.add(5.5, 4.5));
		System.out.println("Hello + World = " + calc.add("Hello", "World"));
	}

}
