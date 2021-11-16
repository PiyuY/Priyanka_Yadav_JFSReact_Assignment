package A6Collection.Question2;

import java.util.HashSet;
import java.util.Set;

public class ProductMain {

	public static void main(String[] args) {
		
		Set<Product> products = new HashSet<Product>();
		
		Product p1 = new Product(2, "HP Laptop", 80700.94);
		
		products.add(new Product(1, "Dell Laptop", 80700.84));
		products.add(new Product(3, "Lenovo Laptop", 75500.40F));
		products.add(p1);
		products.add(new Product(4, "Asus Laptop", 75700.04));
		products.add(p1);
		
		
		for (Product p : products) {
			System.out.println(p);
		}

	}

}
