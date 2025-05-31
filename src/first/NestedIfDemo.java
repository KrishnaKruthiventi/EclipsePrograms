package first;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 25;
		boolean hasLicence =true;
		
		if(age >= 18) {
			if(hasLicence) {
				System.out.println("You can drive");
			} else {
				System.out.println("You need a licence to drive");
			}
		} else {
			System.out.println("You are too young to drive");
		}

	}

}
