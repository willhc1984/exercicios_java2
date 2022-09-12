package streams2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import streams2.model.Categoria;
import streams2.model.Produto;
import streams2.model.Produto.Status;

public class ExemploAnyMatch {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Agua 2L", Status.ATIVO, new BigDecimal(9.9)));
		produtos.add(new Produto("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5)));
		produtos.add(new Produto("Carvão", Status.INATIVO, new BigDecimal(34.2)));
		produtos.add(new Produto("Cerveja 600ml", Status.ATIVO, new BigDecimal(8.4)));
		produtos.add(new Produto("Cupim 2kg", Status.ATIVO, new BigDecimal(92)));
		produtos.add(new Produto("Papel Aluminio", Status.ATIVO, new BigDecimal(8.4)));
		
		boolean temPicanha = false;
		System.out.println("Tem picanha no mercado? " + temPicanha);
		
		for(Produto produto : produtos) {
			if(produto.getNome().equals("Picanha 1kg")) {
				temPicanha = true;
				break;
			}
		}
		
		System.out.println("Tem picanha no mercado? " + temPicanha);
		
		boolean temCerveja = produtos.stream()
				.anyMatch(p -> p.getNome().equals("Cerveja 600ml"));
		
		System.out.println("Tem cerveja no mercado? " + temCerveja);
	}

}
