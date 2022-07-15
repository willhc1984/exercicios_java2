package TestesDIO;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite uma string: ");
			nomes[i] = sc.nextLine();
		}

		System.out.println("Posição " + nomes[3]);
		System.out.println("Posição " + nomes[7]);
		System.out.println("Posição " + nomes[9]);

	}

}
