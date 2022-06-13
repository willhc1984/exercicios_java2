package interfacefuncional_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Lambda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 200.00));
		list.add(new Product("Computador", 300.00));
		list.add(new Product("Geladeira", 158.00));
		list.add(new Product("Ferro", 558.00));
		
		Double min = 300.00;		
		Predicate<Product> pred = p -> p.getPrice() >= min;
		list.removeIf(pred);

		for (Product p : list) {
			System.out.println(p);
		}


	}

}
