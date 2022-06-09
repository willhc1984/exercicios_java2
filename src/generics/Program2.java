package generics;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintServiceGenerics<String> ps = new PrintServiceGenerics<>();
		
		System.out.println("Enter number of values: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}	
		
		ps.print();
		
		System.out.println("First item: " + ps.first());

	}

}
