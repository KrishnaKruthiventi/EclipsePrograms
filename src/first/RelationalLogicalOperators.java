package first;

public class RelationalLogicalOperators {
	public static void main(String[] args) {
		
		int age = 25;
		boolean hasLicense = true;
		
		System.out.println("Age > 21: " + (age > 21));
		System.out.println("Age <= 30: " + (age <= 30));
		System.out.println("Age == 25: " + (age == 25));
		System.out.println("Age != 30: " + (age != 30));
		
		System.out.println("Can drive: " + (age >= 16 && hasLicense));
		System.out.println("Is teenager or senior: " + (age >= 13 && age <= 19 || age >= 65));
		System.out.println("Not eligible: " + !(age >= 18));
		
		boolean result = (5 > 3) || (10/0 == 0);
		System.out.println("Short-circuit result: " + result);
		
		
	}
}
