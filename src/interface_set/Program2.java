package interface_set;

import java.util.HashSet;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		
		Set<Product> products = new HashSet<>();
		products.add(new Product("Radio", 2500.00));
		products.add(new Product("TV", 3500.00));
		products.add(new Product("Computador", 4500.00));
		
		
		//Comparação baseada em equals e hashcode implementada na classe Product.
		Product prod = new Product("Mouse", 80.00);
		System.out.println(products.contains(prod));
		
		Product prod2 = new Product("Radio", 2500.00);
		System.out.println(products.contains(prod2));

	}

}
