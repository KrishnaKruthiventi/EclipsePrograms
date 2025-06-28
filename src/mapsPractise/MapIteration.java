package mapsPractise;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		
		Map<String, Double> productPrices = new HashMap<>();
		productPrices.put("Laptop", 999.99);
		productPrices.put("Phone", 699.99);
		productPrices.put("Tablet", 399.99);
		
		System.out.println("Products and their prices:");
		for(String product: productPrices.keySet()) {
			System.out.println(product + ": $" + productPrices.get(product));
		}
		
		System.out.println("\nUsing entrySet():");
		for(Map.Entry<String, Double> entry: productPrices.entrySet()) {
			System.out.println(entry.getKey() + ": $" + entry.getValue());
		}
		
		System.out.println("\nUsing forEach:");
		productPrices.forEach((k, v) -> System.out.println(k + ": $" + v));
		
		System.out.println("\nAll prices:");
		for(Double price : productPrices.values()) {
			System.out.println("$" + price);
		}
	}

}
