package implementacaoArtistas;

public class Program {

	public static void main(String[] args) {
		Artista artista = new Artista(1, "Led Zepelin", "Inglaterra");
		Artista artista2 = new Artista(2, "Metallica", "USA");
		Artista artista3 = new Artista(3, "U2", "Irlanda");
		
		Album album = new Album(1, "Led Zepellin V", 1975);
		Album album2 = new Album(2, "Led Zepellin IV", 1976);
		Album album3 = new Album(3, "Master of Puppets", 1981);
		Album album4 = new Album(4, "Vertigo", 2002);
		
		Musica musica = new Musica(1, "Stairway to Heaven", 5);
		Musica musica2 = new Musica(2, "Master of Puppets", 5);
		Musica musica3 = new Musica(3, "Sunday blood sunday", 5);
		Musica musica4 = new Musica(4, "Enter Sandman", 5);
		Musica musica5 = new Musica(5, "Kashimir", 5);
		Musica musica6 = new Musica(6, "Beautiful Day", 5);
		
		album.addMusica(musica);
		album.addMusica(musica5);
		album.addParticipantes(artista);
		album.addParticipantes(artista);
		album3.addMusica(musica2);
		album3.addMusica(musica4);
		album3.addParticipantes(artista2);
		album3.addParticipantes(artista2);
		album4.addMusica(musica6);
		album4.addMusica(musica3);
		album4.addParticipantes(artista3);
		album4.addParticipantes(artista3);
		
		System.out.println(album);
		System.out.println(album3);
		System.out.println(album4);
	
		
	}

}
