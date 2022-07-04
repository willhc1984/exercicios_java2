package implementacaoPacotesTuristicos;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Pacote implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date dataViagem;
	private Integer diasPermanencia;
	private Integer refeicoesPorDia;
	
	public Pacote() {
	}

	public Pacote(Integer id, Date dataViagem, Integer diasPermanencia, Integer refeicoesPorDia) {
		super();
		this.id = id;
		this.dataViagem = dataViagem;
		this.diasPermanencia = diasPermanencia;
		this.refeicoesPorDia = refeicoesPorDia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataViagem() {
		return dataViagem;
	}

	public void setDataViagem(Date dataViagem) {
		this.dataViagem = dataViagem;
	}

	public Integer getDiasPermanencia() {
		return diasPermanencia;
	}

	public void setDiasPermanencia(Integer diasPermanencia) {
		this.diasPermanencia = diasPermanencia;
	}

	public Integer getRefeicoesPorDia() {
		return refeicoesPorDia;
	}

	public void setRefeicoesPorDia(Integer refeicoesPorDia) {
		this.refeicoesPorDia = refeicoesPorDia;
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
		Pacote other = (Pacote) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pacote [id=" + id + ", dataViagem=" + dataViagem + ", diasPermanencia=" + diasPermanencia
				+ ", refeicoesPorDia=" + refeicoesPorDia + "]";
	}
	

}
