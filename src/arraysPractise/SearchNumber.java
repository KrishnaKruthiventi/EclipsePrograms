package arraysPractise;

public class SearchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		int searchNum = 2;
		int low = 0;
		int high = arr.length;
		boolean numberFound = false;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == searchNum) {
				numberFound = true;
				break;
			}
			
			if(arr[mid] < searchNum) low = mid + 1;
			else high = mid - 1;
		}
		
		System.out.println(numberFound ? "Number found: " + searchNum : "Number doesn't exist in array");
	}

}
