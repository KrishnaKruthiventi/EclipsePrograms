package first;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			System.out.println("Count: " + i);
		}
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}

	}

}
