package ExceptionHandling;

public class ExceptionPropagation {

	public static void main(String[] args) {
		
		try {
			method1();
		} catch(Exception e) {
			System.out.println("Caught in main: " + e.getMessage());
		}
	}
	
	static void method1() throws Exception{
		method2();
	}
	
	static void method2() throws Exception{
		throw new Exception("Exception from method2");
	}

}
