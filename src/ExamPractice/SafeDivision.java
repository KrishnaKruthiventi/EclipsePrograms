package ExamPractice;

import java.util.Scanner;

public class SafeDivision {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			int num3 = num1 / num2;
			System.out.println(num3);
		} catch(Exception e) {
			System.out.println(-1);
			System.out.println("Cannot divide by zero");
		}
		sc.close();

	}

}
