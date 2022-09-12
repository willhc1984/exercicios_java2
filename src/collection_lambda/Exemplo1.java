package collection_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo1 {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("João");
		
		System.out.println("***Forma de iteração 1***");		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.print(nomes.get(i) + " - ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("***Forma de iteração 2***");
		for(String s : nomes) {
			System.out.print(s + " - ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("***Forma de iteração 3 - Interface Consumer***");
		nomes.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t + " - ");				
			}
		});
		
		System.out.println();
		System.out.println();
		
		System.out.println("***Forma de iteração 4 - Lambda Expression***");
		nomes.forEach(nome -> {
			System.out.print(nome + " - ");
		});
		
		System.out.println();
		System.out.println();
		
		System.out.println("***Forma de iteração 5 - Lambda Expression enxuta***");
		nomes.forEach(nome -> System.out.print(nome + " - "));
		
		System.out.println();
		System.out.println();
		
		System.out.println("***Forma de iteração 6 - Method Reference***");
		nomes.forEach(System.out::println);
		
	}

}
