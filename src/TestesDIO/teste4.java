package TestesDIO;

import java.util.Scanner;

public class teste4 {

	public static void main(String[] args) {

		// a classe Scanner auxilia na leitura dos dados de entrada
  		Scanner scan = new Scanner(System.in);
  
  		int N = scan.nextInt();
  
  		int[] idade = new int[N];
  
  		for (int i = 0; i < N; i++) {
  			int d = scan.nextInt();
  			idade[i] = d;
  		}
  
  		System.out.println("Nao poderao entrar as idades: ");
  		for (int i = 0; i < N; i++) {
  			if (idade[i] < 18) {
  				System.out.println(idade[i]);
  			}
  
  		}
		
	}
}
