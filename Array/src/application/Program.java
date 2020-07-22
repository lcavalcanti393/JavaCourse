package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be ranted? ");
		int n = sc.nextInt();
		
		Room[] room = new Room[10];
		
		for(int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + i +":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int index = sc.nextInt();
			
			room[index] = new Room(name, email);
		}
		
		System.out.println("%nBusy rooms: ");
		
		for(int i=0; i<room.length; i++) {
			if(room[i] != null)
				System.out.println(i +":" + room[i]);
			
		}
		
		sc.close();
	}

}
