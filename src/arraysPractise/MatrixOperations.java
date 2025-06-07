package arraysPractise;

public class MatrixOperations {
	
	public static void printMatrix(int[][] matrix) {
		for(int[] row: matrix) {
			for(int num: row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] addMatrices(int[][] a, int[][] b){
		int rows = a.length;
		int cols = a[0].length;
		int[][] result = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return result;
	}
	
	public static int[][] multiplyMatrices(int[][] a, int[][] b){
		int rows = a.length;
		int cols = a[0].length;
		int[][] result = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				result[i][j] = a[i][j] * b[i][j];
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrixB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		
		System.out.println("Matrix A: ");
		printMatrix(matrixA);
		
		System.out.println("\nMatrix B: ");
		printMatrix(matrixB);
		
		System.out.println("\nMatrix A + B:");
		printMatrix(addMatrices(matrixA, matrixB));
		
		System.out.println("\nMatrix A * B:");
		printMatrix(multiplyMatrices(matrixA, matrixB));
	}

}
