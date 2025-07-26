package findDuplicates;

public class BruteForceApproach {
	
	public static void findDuplicates(int[] arr) {
		System.out.println("Brute Force: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {11, 22, 11, 22, 33, 44, 55, 33};
		findDuplicates(arr);
	}

}
