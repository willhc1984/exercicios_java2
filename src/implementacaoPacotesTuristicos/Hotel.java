package implementacaoPacotesTuristicos;

import java.io.Serializable;
import java.util.Objects;

public class Hotel implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private Double valorDiaria;
	
	public Hotel() {
	}

	public Hotel(Integer id, String nome, Double valorDiaria) {
		super();
		this.id = id;
		this.nome = nome;
		this.valorDiaria = valorDiaria;
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

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
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
		Hotel other = (Hotel) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nome=" + nome + ", valorDiaria=" + valorDiaria + "]";
	}


}
