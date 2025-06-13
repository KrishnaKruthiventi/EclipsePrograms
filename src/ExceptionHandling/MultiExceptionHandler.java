package ExceptionHandling;

public class MultiExceptionHandler {

	public static void main(String[] args) {
		
		try {
			String input = "123a";
			int num = Integer.parseInt(input);
			int[] arr = new int[3];
			arr[5] = num;
		} catch(NumberFormatException e) {
			System.out.println("Invalid number format!");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds!");
		}

	}

}
