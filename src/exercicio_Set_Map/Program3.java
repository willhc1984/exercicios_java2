package exercicio_Set_Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = sc.next();
		Map<String, Integer> candidate = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				candidate.put(fields[0], Integer.parseInt(fields[1]));
				line = br.readLine();			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println(candidate.containsKey("mraria"));
		System.out.println(candidate.keySet());
		
		
	}

}
