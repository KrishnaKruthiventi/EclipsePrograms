package ExamPractice;

import java.util.Scanner;

public class MatrixRotation {
	
	public static void printMatrix(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void rotateMatrix(int[][] arr, int[][] rotatedArr) {
		int m = arr.length;
		int n = arr[0].length;
		int k = 0;
		int l = 0;
		
		for(int j = 0; j < n; j++) {
			for(int i = m - 1; i >= 0; i--) {
				rotatedArr[k][l] = arr[i][j];
				l++;
				
			}
			k++;
			l = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] arr = new int[m][n];
		int[][] rotatedArr = new int[n][m];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		rotateMatrix(arr, rotatedArr);
		printMatrix(rotatedArr);
		sc.close();
	}

}
