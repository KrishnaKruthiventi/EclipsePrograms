package arraysPractise;

import java.util.Arrays;

public class InterviewPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {-10, -5, 1, 2, 3, 4, 5};
		int[] result = new int[7];
		
		int low = 0;
		int high = input.length - 1;
		int i = high;
		
		while(i >= 0) { 
			int firstSquare = input[low] * input[low]; 
			int lastSquare = input[high] * input[high]; 
			
			if(low == high) {
				result[i] = firstSquare;
			} else {
				if(firstSquare == lastSquare) {
					result[i - 1] = lastSquare;
					result[i] = lastSquare; 
					i--; 
					high--; 
					low++; 
				} else if(firstSquare < lastSquare) {
					result[i] = lastSquare; 
					high--; 
				} else {
					result[i] = firstSquare;
					low++;
				}	
			}
			i--; 
			
		}
		
		System.out.println(Arrays.toString(result));
	}

}
