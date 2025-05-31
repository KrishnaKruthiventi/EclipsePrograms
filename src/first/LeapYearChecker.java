package first;

public class LeapYearChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 2024;
		boolean isLeapYear = (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
		System.out.println(year + " is a leap year: " + isLeapYear);
	}

}
