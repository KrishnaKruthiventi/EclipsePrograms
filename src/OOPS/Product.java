package OOPS;

public class Product {
	
	String name;
	double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void display() {
		System.out.println(name + ": $" + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] products = new Product[3];
		
		products[0] = new Product("Laptop", 999.99);
		products[1] = new Product("Phone", 699.99);
		products[2] = new Product("Tablet", 399.99);
		
		for(Product p : products) {
			p.display();
		}
		
	}

}
