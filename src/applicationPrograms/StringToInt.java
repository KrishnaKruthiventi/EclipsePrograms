package applicationPrograms;

public class StringToInt {
	
	public static int convert(String str) throws NumberFormatException{
		int result = 0;
		
		boolean isNegative = false;
		int i = 0;
		
		if(str.charAt(i) == '-') {
			isNegative = true;
			i = 1;
		}
		
		for(i = i; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c >= '0' && c <= '9') {
				result = result * 10 + (Character.getNumericValue(c));
			} else {
				throw new NumberFormatException("Invalid character: " + c);
			}
		}
		
		return isNegative ? -result : result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numStr = "57890";
		
		try {
			System.out.println("Converted integer: " + convert(numStr));
		} catch(NumberFormatException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
