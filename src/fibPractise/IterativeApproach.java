package fibPractise;

public class IterativeApproach {
	
	public static void fibnocciIterative(int num) {
		int n1 = 0;
		int n2 = 1;
		
		for(int i = 0; i < num; i++) {
			System.out.print(n1 + " ");
			
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		
		int num = 8;
		fibnocciIterative(num);

	}

}
