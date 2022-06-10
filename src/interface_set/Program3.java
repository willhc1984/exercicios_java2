package interface_set;

import java.util.Set;
import java.util.TreeSet;

public class Program3 {

	public static void main(String[] args) {
		
		Set<Product> products = new TreeSet<>();
		products.add(new Product("Radio", 2500.00));
		products.add(new Product("TV", 3500.00));
		products.add(new Product("Computador", 4500.00));
	
	//TreeSet exige que a classe Product implemente interface Comparable
	for(Product p : products) {
		System.out.println(p);
	}

	}

}
