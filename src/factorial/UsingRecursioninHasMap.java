package factorial;

import java.util.HashMap;
import java.util.Map;

public class UsingRecursioninHasMap {
	
	static Map<Integer, Integer> hmap = new HashMap<>();
	
	public static int factorial(int n) {
		
		if(n <= 1) {
			return 1;
		}
		
		if(hmap.containsKey(n)) {
			return hmap.get(n);
		}
		
		int result = n * factorial(n - 1);
		hmap.put(n, result);
		
		return result;
	}
	
	public static void main(String[] args) {
		int n = 6;
		System.out.println(factorial(n));

	}

}
