package factorial;

import java.math.BigInteger;

public class UsingBigInteger {
	
	public static BigInteger factorial(int n) {
		BigInteger bigNum = BigInteger.ONE;
		
		for(int i = 1; i <= n; i++) {
			bigNum = bigNum.multiply(BigInteger.valueOf(i));
		}
		
		return bigNum;
	}

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(factorial(n));

	}

}
