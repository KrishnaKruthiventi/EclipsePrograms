package recursionPractise;

public class Factorial {
	
	public static int factorial(int num) {
		if(num == 1) return 1;
		
		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		
		int num = 6;
		System.out.println("Factorial of " + num + " is " + factorial(num));

	}

}
