package implementacaoPacotesTuristicos;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		Cidade cidade1 = new Cidade(1, "Rio de Janeiro", "RJ", "www.rio.com");
		Hotel hotel1 = new Hotel(1, "Hotel Chateau", 300.00, cidade1);
		Hotel hotel2 = new Hotel(2, "Hotel Brisa de Mar", 397.00, cidade1);
		Hotel hotel3 = new Hotel(3, "Hotel California", 459.00, cidade1);
		cidade1.addHotel(hotel1);
		cidade1.addHotel(hotel2);
		cidade1.addHotel(hotel3);
		
		Cidade cidade2 = new Cidade(2, "São Paulo", "SP", "www.sp.com");
		Hotel hotel4 = new Hotel(4, "Hotel IBIS", 380.00, cidade2);
		Hotel hotel5 = new Hotel(5, "Hotel California II", 255.00, cidade2);
		Hotel hotel6 = new Hotel(6, "Hotel Maresia", 522.00, cidade2);
		cidade2.addHotel(hotel4);
		cidade2.addHotel(hotel5);
		cidade2.addHotel(hotel6);
		
		Restaurante r1 = new Restaurante(1, "Gaucho", 25.50, cidade2);
		Restaurante r3 = new Restaurante(1, "Aroma e sabor", 36.50, cidade2);
		Restaurante r2 = new Restaurante(1, "Comida caseira", 12.50, cidade1);
		Restaurante r4 = new Restaurante(1, "Delicias do mar", 70.50, cidade1);
		
		cidade1.addRestaurante(r4);
		cidade1.addRestaurante(r3);
		cidade2.addRestaurante(r1);
		cidade2.addRestaurante(r2);
		
		PacoteTuristico p1 = new PacoteTuristico(1, new Date(), 3, 4, cidade1);
		PacoteTuristico p2 = new PacoteTuristico(1, new Date(), 3, 4, cidade2);
		PacoteTuristico p3 = new PacoteTuristico(1, new Date(), 3, 4, cidade2);
		
		hotel4.addPacoteTuristico(p1);
		hotel2.addPacoteTuristico(p3);
		hotel2.addPacoteTuristico(p2);
		
		cidade2.addPacote(p3);
		cidade2.addPacote(p2);
		cidade1.addPacote(p1);
		
		System.out.println(cidade1);
		System.out.println(cidade2);
		System.out.println();
		
		System.out.println(hotel4);
		System.out.println(hotel2);
		System.out.println();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
