package fibPractise;

import java.util.HashMap;
import java.util.Map;

public class FibRecursiveWithHashMap {
	
	static Map<Integer, Integer> hmap = new HashMap<>();
	
	public static int fibRecursive(int num) {
		
		if(num <= 1) {
			return num;
		}
		
		if(hmap.containsKey(num)) {
			return hmap.get(num);
		}
		
		int result = fibRecursive(num - 1) + fibRecursive(num - 2);
		hmap.put(num, result);
		return result;
	}
	
	public static void main(String[] args){
		int num = 7;
		System.out.println(fibRecursive(num));

	}

}
