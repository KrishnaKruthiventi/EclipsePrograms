package findDuplicates;

public class FrequencyArray {
	
	public static void findDuplicates(int[] arr, int maxValue) {
		System.out.println("Frequency Array: ");
		int[] freq = new int[maxValue + 1];
		
		for(int num: arr) {
			freq[num]++;
		}
		
		for(int i = 0; i < freq.length; i++) {
			if(freq[i] > 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {11, 22, 11, 22, 33, 44, 55, 33};
		findDuplicates(arr, 55);

	}

}
