package implementacaoArtistas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Album implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Integer ano;
	
	private List<Artista> participantes = new ArrayList<>();
	private List<Musica> musicas = new ArrayList<>();
	
	public Album(){
	}

	public Album(Integer id, String nome, Integer ano) {
		super();
		this.id = id;
		this.nome = nome;
		this.ano = ano;
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

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public List<Artista> getParticipantes() {
		return participantes;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}
	
	public void addMusica(Musica musica) {
		musicas.add(musica);
	}
	
	public void addParticipantes(Artista artista) {
		participantes.add(artista);
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
		Album other = (Album) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", nome=" + nome + ", ano=" + ano + ", participantes=" + participantes + ", musicas="
				+ musicas + "]";
	}
	
	
	
}
