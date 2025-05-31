package applicationPrograms;

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 18;
		int factors = 0;
		
		for(int i = 2; i < 17; i++) {
			if(num % i == 0) {
				factors += 1;
				break;
			}
		}
		
		System.out.println(factors == 0 ? "Prime" : "Not Prime");

	}

}
