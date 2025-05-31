package applicationPrograms;
import java.util.*;

public class MenuDrivenCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		int choice;
		
		do {
			System.out.println("\nCalculator Menu");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			if(choice >= 1 && choice < 5) {
				System.out.println("Enter first number:");
				num1 = sc.nextDouble();
				System.out.println("Enter second number:");
				num2 = sc.nextDouble();
				
				switch(choice) {
				case 1 -> System.out.println("Result: " + (num1 + num2));
				case 2 -> System.out.println("Result: " + (num1 - num2));
				case 3 -> System.out.println("Result: " + (num1 * num2));
				case 4 -> {
					if(num2 != 0) System.out.println("Result: " + (num1 / num2));
					else System.out.println("Error: Division by zero");
				}
				}
				
			}else if(choice != 5) System.out.println("Invalid choice");
			
		}while (choice != 5);
		
		System.out.println("Calculator closed");
		sc.close();
	}

}
