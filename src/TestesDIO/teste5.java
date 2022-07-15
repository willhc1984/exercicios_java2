package TestesDIO;

import java.util.Scanner;

public class teste5 {

	public static void main(String[] args) {

		// a classe Scanner auxilia na leitura dos dados de entrada
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		String string = scan.next();

		// quebra string em várias substrings a partir de um caractere
		String[] s = string.split(" ");
		
		Double[] idade = new Double[N];
	
		for (int i = 0; i < N; i++) {
			idade[i] =  Double.parseDouble(s[i]);
		}

		System.out.println("Nao poderao entrar as idades: ");
		for (int i = 0; i < N; i++) {
			if (idade[i] < 18) {
				System.out.println(idade[1] + ", ");
			}

		}

	}

}
