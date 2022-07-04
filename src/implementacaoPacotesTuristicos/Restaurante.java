package implementacaoPacotesTuristicos;

import java.io.Serializable;
import java.util.Objects;

public class Restaurante implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private Double valorRefeicao;
	private Cidade cidade;
	
	public Restaurante() {
	}

	public Restaurante(Integer id, String nome, Double valorRefeicao, Cidade cidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.valorRefeicao = valorRefeicao;
		this.cidade = cidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorRefeicao() {
		return valorRefeicao;
	}

	public void setValorRefeicao(Double valorRefeicao) {
		this.valorRefeicao = valorRefeicao;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: ");
		sb.append(id + "\n");
		sb.append("Nome: ");
		sb.append(nome + "\n");
		sb.append("Valor da Refei��o: ");
		sb.append(valorRefeicao + "\n");
		sb.append("Cidade: ");
		sb.append(cidade.getNome() + "\n");
		
		return sb.toString();
	}
	
}
