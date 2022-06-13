package interfacefuncional_lambda;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 300.00;
	}
	

}
