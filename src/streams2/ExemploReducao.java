package streams2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

import streams2.model.Produto;
import streams2.model.Produto.Status;

public class ExemploReducao {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();

		produtos.add(new Produto("Agua 2L", Status.ATIVO, new BigDecimal(9.9)));
		produtos.add(new Produto("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5)));
		produtos.add(new Produto("Carvão", Status.INATIVO, new BigDecimal(34.2)));
		produtos.add(new Produto("Cerveja 600ml", Status.ATIVO, new BigDecimal(8.4)));
		produtos.add(new Produto("Cupim 2kg", Status.ATIVO, new BigDecimal(92)));
		
		BigDecimal total = BigDecimal.ZERO;
		
		System.out.println(total);
		
		for(Produto produto : produtos) {
			if(produto.getStatus().equals(Status.ATIVO)) {
				total = total.add(produto.getPreco());
			}
		}
		
		System.out.println("Total em produtos ativo: R$ " + total);
		
		BinaryOperator<BigDecimal> operacao = (x,y) -> x.add(y);
		
		BigDecimal total2 = produtos.stream()
				.filter(p -> p.getStatus().equals(Status.ATIVO))
				.map(Produto::getPreco)
				.reduce(BigDecimal.ZERO, operacao);
		
		System.out.println("Total em produtos ativo: R$ " + total2);
		
	}
}
