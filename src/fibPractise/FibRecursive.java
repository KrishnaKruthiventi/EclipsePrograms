package fibPractise;

public class FibRecursive {
	
	public static int fibRecursive(int num) {
		if(num <= 1) {
			return num;
		}
		
		return fibRecursive(num - 1) + fibRecursive(num - 2);
	}
	
	public static void main(String[] args) {
		
		int num = 8;
		System.out.println(fibRecursive(num));

	}

}
