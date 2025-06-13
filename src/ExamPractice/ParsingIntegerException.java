package ExamPractice;

import java.util.Scanner;

public class ParsingIntegerException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		try {
			long number = Integer.parseInt(num);
			System.out.println(number);
		} catch(NumberFormatException e) {
			System.out.println(-1);
		}
		sc.close();

	}

}
