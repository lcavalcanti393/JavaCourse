package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> list = new HashMap<>();
		
		//C:\\Users\\Lucas\\Documents\\MeusProjetos\\JavaCourse\\Map\\in.txt
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String lines = br.readLine();

			while (lines != null) {
				String[] fields = lines.split(",");

				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);

				if(list.containsKey(name)) {
					int othersVotes = list.get(name);
					list.put(name, votes + othersVotes);
				}
				else {				
					list.put(name, votes);
				}
				
				lines = br.readLine();
			}

		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
		
		
		for(String key : list.keySet()) {
			System.out.println(key + " : " + list.get(key));
		}

		
		sc.close();
	}

}
