package TestesDIO;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int casos = input.nextInt();
		int cont = 0;
		while (cont < casos) {

			double a = input.nextDouble(); 
			double b = input.nextDouble();
			double c = input.nextDouble();
			
			String resultado = String.format("%.1f", (a * 2 + b * 3 + c * 5) / 10);
			// TODO: complete os espaços em branco com sua solução para o problema
			System.out.println(resultado);
			cont++;
		}

	}

}
