package optional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import optional.Produto.Status;

public class CatalogoProduto {
	

	private List<Produto> produtos = new ArrayList<>();
	
	public CatalogoProduto() {
		produtos.add(new Produto("Água 2L", Status.ATIVO, new BigDecimal(9.9)));
		produtos.add(new Produto("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5)));
		produtos.add(new Produto("Carvão", Status.INATIVO, new BigDecimal(34.2)));
		produtos.add(new Produto("Cerveja 600ml", Status.ATIVO, new BigDecimal(8.4)));
		produtos.add(new Produto("Cupim 2kg", Status.ATIVO, new BigDecimal(92)));
	}
	
	public Produto buscar(String nome) {
		for (Produto produto : this.produtos) {
			if (produto.getNome().equals(nome)) {
				return produto;
			}
		}
		
		return null;
	}
	
	public Optional<Produto> buscarOptional(String nome) {
		for (Produto produto : this.produtos) {
			if (produto.getNome().equals(nome)) {
				return Optional.of(produto);
			}
		}
		
		return Optional.empty();
	}
	
	public Optional<BigDecimal> buscarPreco(String nome) {
		return this.produtos.stream()
			.filter(p -> p.getNome().equals(nome))
			.map(Produto::getPreco)
			.findFirst();
	}

	public List<Produto> getProdutos() {
		return produtos;
	}


}
