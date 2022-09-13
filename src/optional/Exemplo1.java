package optional;

import java.math.BigDecimal;
import java.util.Optional;

public class Exemplo1 {
	
	public static void main(String[] args) {
		
		CatalogoProduto catalogo = new CatalogoProduto();	
		
		Produto produto = catalogo.buscar("Carvão");
		
		if(produto != null) {
			produto.setPreco(produto.getPreco().add(new BigDecimal(100)));	
			System.out.println(produto.getPreco());
		}else {
			System.out.println("Produto não encontrado!");
		}
		
		Optional<Produto> optionalProduto = catalogo.buscarOptional("Picanha 1kg");
		
		System.out.println(optionalProduto);
		
		if(optionalProduto.isPresent()) {
			Produto produto1 = optionalProduto.get();
			produto1.setPreco(produto1.getPreco().add(new BigDecimal(10)));
			System.out.println(produto1.getPreco());
		}
		
		
		
		
	}

}
