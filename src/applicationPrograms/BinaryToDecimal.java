package applicationPrograms;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long binNum = 110110111;
		long num = 0;
		int i = 0;
		
		while(binNum > 0) {
			long rem = binNum % 10;
			long val = (long) Math.pow(2, i);
			binNum = binNum /10;
			i++;
			num += rem * val;
		}
		
		System.out.println(num);

	}

}
