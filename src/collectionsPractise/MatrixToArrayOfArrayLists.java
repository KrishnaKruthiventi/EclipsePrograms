package collectionsPractise;

import java.util.ArrayList;

public class MatrixToArrayOfArrayLists {
	
	public static ArrayList<ArrayList<Integer>> matrixToArrayList(int[][] matrix){
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		
		for(int[] row: matrix) {
			ArrayList<Integer> rowList = new ArrayList<>();
			for(int num: row) {
				rowList.add(num);
			}
			result.add(rowList);
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		ArrayList<ArrayList<Integer>> list = matrixToArrayList(matrix);
		System.out.println(list);
		
	}

}
