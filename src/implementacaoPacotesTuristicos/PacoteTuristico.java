package implementacaoPacotesTuristicos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class PacoteTuristico implements Serializable{
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date dataViagem;
	private Integer diasPermanencia;
	private Integer refeicoesPorDia;
	private Cidade cidade;
	
	public PacoteTuristico() {
	}

	public PacoteTuristico(Integer id, Date dataViagem, Integer diasPermanencia, Integer refeicoesPorDia, Cidade cidade) {
		super();
		this.id = id;
		this.dataViagem = dataViagem;
		this.diasPermanencia = diasPermanencia;
		this.refeicoesPorDia = refeicoesPorDia;
		this.cidade = cidade;
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
		PacoteTuristico other = (PacoteTuristico) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: ");
		sb.append(id + "\n");
		sb.append("Data da viagem: ");
		sb.append(sdf.format(dataViagem) + "\n");
		sb.append("Dias de permanencia: ");
		sb.append(diasPermanencia + "\n");
		sb.append("Refeições por dia: ");
		sb.append(refeicoesPorDia + "\n");
		sb.append("Cidade: ");
		sb.append(cidade.getNome() + "\n");
		return sb.toString();
	}
	

}
