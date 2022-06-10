package interface_set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		//Lê o caminho digitado pelo usuario, lê o conteudo do arquivo, adiciona o conteudo do arquivo
		//em um HashSet (não aceita valores repetidos) com objetos da classe EntryLog e imprime o conteudo do HashSet
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<LogEntry> log = new HashSet<>();
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				log.add(new LogEntry(username, moment));
				line = br.readLine();
			}
			
			for(LogEntry l : log) {
				System.out.println(l.getName() + " - " + l.getMoment());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
