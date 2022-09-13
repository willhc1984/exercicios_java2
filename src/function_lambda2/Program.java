package function_lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> products = new ArrayList<>();
		products.add(new Product("TV", 100.00));
		products.add(new Product("Mouse", 750.00));
		products.add(new Product("Tablet", 150.00));
		products.add(new Product("HD Case", 45.00));
		
		System.out.println(products);
		System.out.println("*******************************************");
		
		products.removeIf(new ProductPredicate());
		System.out.println(products);
		
		System.out.println("*******************************************");
		products.removeIf(p -> p.getPrice() >= 40.00);
		System.out.println(products);
		
	}


}
