package sqaureTheArray;

import java.util.Arrays;
import java.util.PriorityQueue;

public class UsingPriorityQueue {

	public static void main(String[] args) {
		
		int[] arr = {-5, -3, -2, 2, 4, 5};
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		
		for(int num: arr) {
			pqueue.add(num * num);
		}
		
		int[] result = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			result[i] = pqueue.poll();
		}
		
		System.out.println(Arrays.toString(result));

	}

}
