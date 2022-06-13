package function_lambda;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramRefactor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 200.00));
		list.add(new Product("Computador", 300.00));
		list.add(new Product("Carro", 158.00));
		list.add(new Product("Travesseiro", 558.00));
			
		ProductServiceRefactor ps = new ProductServiceRefactor();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'C');
		System.out.println("Sum: " + String.format("%.2f", sum));
		
		sum = ps.filteredSum(list, p -> p.getPrice() >= 300 );
		System.out.println("Sum: " + String.format("%.2f", sum));


	}

}
