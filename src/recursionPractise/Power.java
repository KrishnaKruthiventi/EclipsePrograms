package recursionPractise;

public class Power {
	
	public static double power(double base, int exponent) {
		if(exponent == 0) return 1;
		else if(exponent > 0) return base * power(base, exponent - 1);
		else return 1 / (base * power(base, -exponent - 1));
	}

	public static void main(String[] args) {
		
		System.out.println("2^5 = " + power(-2, 5));
		System.out.println("3^-2 = " + power(3, -2));

	}

}
