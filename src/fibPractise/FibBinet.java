package fibPractise;

public class FibBinet {
	
	public static long fibonacci(int n) {
		
		double sqrt5 = Math.sqrt(5);
		double phi = (1 + sqrt5) / 2;
		double psi = (1- sqrt5) / 2;
		
		return Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5);
	}

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Fibonocci(" + i + ") = " + fibonacci(i));
		}

	}

}
