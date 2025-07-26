package findDuplicates;

public class MarkingNegative {
	
	public static void findDuplicates(int[] arr) {
		System.out.println("Marking Negative: ");
		for(int i = 0; i < arr.length; i++) {
			int index = Math.abs(arr[i]) - 1;
			if(arr[index] < 0) {
				System.out.print(Math.abs(arr[i]) + " ");
			} else {
				arr[index] = -arr[index];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Math.abs(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = {11, 22, 11, 22, 33, 44, 55, 33};
		findDuplicates(arr);
	}

}
