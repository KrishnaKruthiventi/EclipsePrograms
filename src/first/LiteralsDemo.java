package first;

public class LiteralsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int decimal = 100;
		int octal = 0144;
		int hex = 0x64;
		int binary = 0b1100100;
		
		System.out.println("Decimal 100: " + decimal);
		System.out.println("Octal 0144: " + octal);
		System.out.println("Hexadecimal 0x64: " + hex);
		System.out.println("Binary 0b1100100: " + binary);
		
		double scientific = 1.234e2;
		System.out.println("Scientific notation 1.234e2: " + scientific);
		
		char letter = 'J';
		String greeting = "Hello Java";
		System.out.println("Character: " + letter);
		System.out.println("String: " + greeting);
		
		System.out.println("Newline: Hello\nWorld");
		System.out.println("Tab: Hello\tWorld");
		System.out.println("Backslash: C:\\Program Files\\Java");
		System.out.println("Double quote: \"Java\"");
		
	}

}
