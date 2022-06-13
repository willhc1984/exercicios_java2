package consumer_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Lambda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 200.00));
		list.add(new Product("Computador", 300.00));
		list.add(new Product("Geladeira", 158.00));
		list.add(new Product("Ferro", 558.00));
		
		Double min = 300.00;		
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);	
		
		list.forEach(cons);

		list.forEach(System.out::println);



	}

}
