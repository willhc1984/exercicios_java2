package generics;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintService ps = new PrintService();
		
		System.out.println("Enter number of values: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}	
		
		ps.print();
		
		System.out.println("First item: " + ps.first());

	}

}
