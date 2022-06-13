package function_lambda;

import java.util.function.Function;

public class UpperCaseFunction implements Function<Product, String>{

	@Override
	public String apply(Product p) {		
		return p.getName().toUpperCase();
	}

}
