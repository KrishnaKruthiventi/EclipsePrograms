package applicationPrograms;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num = 439;
		String decimal = "";
		
		while(num > 0) {
			long rem = num % 2;
			decimal = String.valueOf(rem) + decimal;
			num = num / 2;
		}
		
		System.out.println(decimal);
	}

}
