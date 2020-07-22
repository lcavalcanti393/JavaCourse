package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bank user;
		
		System.out.print("Enter number account: ");
		int account = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char value = sc.next().charAt(0);
		
		if(value == 'y') {		
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			
			user = new Bank(account, name, deposit);
		}else {
			user = new Bank(account, name);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(user);
		
		System.out.print("\nEnter a deposit value: ");
		double deposit = sc.nextDouble();
		user.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.print(user);
		
		System.out.print("\nEnter a withdraw value: ");
		double amount = sc.nextDouble();
		user.withdraw(amount);
		System.out.println("\nUpdated data account: ");
		System.out.print(user);
		
		sc.close();
	}

}
