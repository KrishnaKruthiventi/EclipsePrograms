package first;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) break;
			System.out.println(i);
		}
		
		outerLoop:
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
				if(i == 2 && j == 2) break outerLoop;
			}
		}

	}

}
