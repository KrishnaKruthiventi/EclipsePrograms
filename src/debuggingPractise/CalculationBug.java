package debuggingPractise;

public class CalculationBug {
	
	public static int calculateDiscount(int price, int discountPercent) {
		return price - (discountPercent * price) / 100;
	}

	public static void main(String[] args) {
		
		int result = calculateDiscount(1000, 20);
		System.out.println("Discounted price: " + result);

	}

}
