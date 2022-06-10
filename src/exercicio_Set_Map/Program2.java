package exercicio_Set_Map;

import java.util.HashMap;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {
		
		Map<Product, Double> stock = new HashMap<Product, Double>();
		
		Product p1 = new Product("TV", 2500.00);
		Product p2 = new Product("Computador", 3500.00);
		Product p3 = new Product("Mouse", 500.00);
		
		stock.put(p1, 1000.00);
		stock.put(p2, 280.00);
		stock.put(p3, 320.00);
		
		Product p4 = new Product("TV", 2500.00);
		
		//Classe Product precisa implementar equal e hashcode para fazer comparação
		System.out.println(stock.containsKey(p4));
		
	}

}
