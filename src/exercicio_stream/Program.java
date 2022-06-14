package exercicio_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> employees = new ArrayList<>();
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));				
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			List<String> names = employees.stream()
					.filter(p -> p.getSalary() > salary)
					.map(p -> p.getEmail())
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + salary);
			names.forEach(System.out::println);
					
			Double sum = employees.stream()
				.filter(x -> x.getName().charAt(0) == 'M')
				.map(x -> x.getSalary()).reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary from people whose name starts with 'M' " + String.format("%.2f", sum));
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
