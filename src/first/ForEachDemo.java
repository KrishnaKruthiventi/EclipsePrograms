package first;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 3, 4, 5};
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		String[] fruits = {"Apple", "Banana", "Cherry"};
		for(String fruit : fruits) {
			System.out.println(fruit);
		}

	}

}
