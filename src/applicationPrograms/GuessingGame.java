package applicationPrograms;
import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int secretNumber = rd.nextInt(100) + 1;
		int attempts = 0;
		boolean guessed = false;
		
		while(!guessed) {
			System.out.println("Enter a number between 1 and 100");
			int guess = sc.nextInt();
			attempts++;
			
			if(guess == secretNumber) {
				guessed = true;
				System.out.println("Correct! You guessed it in " + attempts + " attempts.");
			}
			else if(guess < secretNumber) System.out.println("Too Low, try again");
			else System.out.println("Too High, try again");
		}
		sc.close();

	}

}
