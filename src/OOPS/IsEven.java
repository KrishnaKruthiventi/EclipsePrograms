package OOPS;

public class IsEven {
	
	public static boolean isEven(int num) {
		int rem = num % 2;
		return rem == 0 ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is 4 even? " + isEven(4));
		System.out.println("Is 7 even? " + isEven(7));
	}

}
