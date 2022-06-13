package function_lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 200.00));
		list.add(new Product("Computador", 300.00));
		list.add(new Product("Geladeira", 158.00));
		list.add(new Product("Ferro", 558.00));
			
		Function<Product, String> func = p -> p.getName().toUpperCase();
		
		List<String> names = list.stream().map(func).collect(Collectors.toList());

		names.forEach(System.out::println);



	}

}
