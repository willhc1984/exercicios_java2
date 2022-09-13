package function_lambda;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}
	
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("TV", 200.00));
		products.add(new Product("Computador", 300.00));
		products.add(new Product("Geladeira", 158.00));
		products.add(new Product("Travesseiro", 558.00));
		
		products.sort(Program3::compareProducts);		
		products.forEach(System.out::println);
		System.out.println("**********************************************");
		
		products.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
		products.forEach(System.out::println);
		
	}

}
