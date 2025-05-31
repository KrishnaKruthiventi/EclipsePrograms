package first;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 5; i++) {
			if(i == 3) continue;
			System.out.println(i);
		}
		
		for(int i = 1; i <= 10; i++) {
			if( i % 2 == 0) continue;
			System.out.print(i + " ");
		}
	}

}
