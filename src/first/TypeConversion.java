package first;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 9;
		double myDouble = myInt;
		
		System.out.println("int: " + myInt);
		System.out.println("double after widening: " + myDouble);
		
		double anotherDouble = 9.78;
		int anotherInt = (int) anotherDouble;
		
		System.out.println("double: " + anotherDouble);
		System.out.println("int after narrowing: " + anotherInt);
		
		byte smallByte = (byte) 200;
		System.out.println("Overflow example: " + smallByte);
		
		char myChar = 'A';
		int charToInt = myChar;
		System.out.println("char 'A' as int: " + charToInt);
	}

}
