package consumer_lambda;

import java.util.function.Consumer;

public class ConsumerPriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	

}
