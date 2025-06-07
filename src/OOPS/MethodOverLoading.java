package OOPS;

public class MethodOverLoading {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2 + 3 = " + add(2, 3));
		System.out.println("2 + 3 + 4 = " + add(2, 3, 4));
	}

}
