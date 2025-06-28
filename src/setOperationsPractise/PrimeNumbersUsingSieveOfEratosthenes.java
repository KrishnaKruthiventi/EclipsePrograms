package setOperationsPractise;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumbersUsingSieveOfEratosthenes {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		int start = 2;
		int end = 100;
		
		for(int i = start; i <= end; i++) {
			set.add(i);
		}
		
		for(int i = start; i <= end; i++) {
			int num = i;
			for(int j = 2; j <= end / 2; j++) {
				set.remove(num * j);
			}
		}
		
		System.out.println(set);

	}

}
