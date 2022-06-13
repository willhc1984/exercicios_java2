package function_lambda;

import java.util.List;

public class ProductService {
	
	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for(Product p : list) {
			if(p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
