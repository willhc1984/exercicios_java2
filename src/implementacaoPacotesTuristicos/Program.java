package implementacaoPacotesTuristicos;

import java.util.Arrays;

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
		
		System.out.println(cidade1);
		System.out.println(cidade2);
		System.out.println();
		
		System.out.println(hotel4);
		System.out.println(hotel2);
	}

}
