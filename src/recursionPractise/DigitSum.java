package recursionPractise;

public class DigitSum {
	
	public static int sumDigits(int num) {
		if(num < 10) return num;
		return num % 10 + sumDigits(num / 10); 
	}

	public static void main(String[] args) {
		
		int num = 1234;
		System.out.println("Sum of digits in " + num + " is: " + sumDigits(num));

	}

}
