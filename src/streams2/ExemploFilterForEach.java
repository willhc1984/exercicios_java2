package streams2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import streams2.model.Produto;
import streams2.model.Produto.Status;

public class ExemploFilterForEach {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Agua 2L", Status.ATIVO, new BigDecimal(9.9)));
		produtos.add(new Produto("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5)));
		produtos.add(new Produto("Carvão", Status.ATIVO, new BigDecimal(34.2)));
		produtos.add(new Produto("Cerveja 600ml", Status.ATIVO, new BigDecimal(8.4)));
		produtos.add(new Produto("Cupim 2kg", Status.ATIVO, new BigDecimal(92)));
		
		for(Produto produto : produtos) {
			if(produto.getNome().startsWith("C")) {
				produto.inativar();
			}
		}
		
		System.out.println("*********************************");
		
		Predicate<Produto> predicate = p -> p.getNome().startsWith("C");
		Consumer<Produto> consumer = p -> p.inativar();
		
		Stream<Produto> produtosStream = produtos.stream()
				.filter(predicate);
		
		produtosStream.forEach(consumer);
		
		System.out.println("*********************************");
		
		Stream<Produto> produtosStream2 = produtos.stream()
				.filter(p -> p.getNome().startsWith("C"));
		
		produtosStream2.forEach(Produto::inativar);
		
		System.out.println("*********************************");
		
		produtos.stream()
			.filter(p -> p.getNome().startsWith("C"))
			.forEach(Produto::inativar);
		
	}

}
