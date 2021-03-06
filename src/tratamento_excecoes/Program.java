package tratamento_excecoes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.println("Titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Saldo inicial: ");
		Double balance = sc.nextDouble();
		System.out.println("Limite de saque: ");
		Double withDrawLimit = sc.nextDouble();
		
		Account ac1 = new Account(number, holder, balance, withDrawLimit);
		
		System.out.println("Informe o valor a ser depositado: ");
		Double deposito = sc.nextDouble();
		ac1.deposit(deposito);
		
		System.out.println("Informe a quantia para sacar: ");
		double withdraw = sc.nextDouble();
		
		try {
			ac1.withdraw(withdraw);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Saldo atual: " + ac1.getBalance());
		
		/*
		 * String error = ac1.validateWithDraw(withdraw); if(error != null) {
		 * System.out.println(error); System.out.println("Saldo atual: " +
		 * ac1.getBalance()); System.out.println("Limit de saque: " +
		 * ac1.getWithDrawLimit()); } else { ac1.withdraw(withdraw);
		 * System.out.println("Saldo atual: " + ac1.getBalance()); }
		 */
		
		sc.close();

	}

}
