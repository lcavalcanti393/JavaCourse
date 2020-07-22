package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		CurrencyConverter.dolarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.quantity = sc.nextDouble();
		
		System.out.print("Amount to be paid in reais : " + String.format("%.2f", CurrencyConverter.finalPrice()));
		//Tribute already increased
		
		sc.close();
	}

}
