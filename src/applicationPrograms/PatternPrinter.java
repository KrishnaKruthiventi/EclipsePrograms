package applicationPrograms;

public class PatternPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			System.out.println("* ".repeat(i));
		}
		
		for(int i = 1; i <= n; i++) {
			String spaces = " ".repeat(n - i);
			String stars = "* ".repeat(i);
			System.out.println(spaces + stars);
		}

	}

}
