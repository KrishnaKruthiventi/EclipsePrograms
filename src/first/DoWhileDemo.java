package first;
import java.util.*;
public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		do {
			System.out.println("Count: " + i);
			i++;
		}while(i <= 5);
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1. Option 1");
			System.out.println("2. Option 2");
			System.out.println("3. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 -> System.out.println("Option 1 selected");
			case 2 -> System.out.println("Option 2 selected");
			case 3 -> System.out.println("Exiting...");
			default -> System.out.println("Invalid choice");
			}
		} while(choice != 3);
		sc.close();

	}

}
