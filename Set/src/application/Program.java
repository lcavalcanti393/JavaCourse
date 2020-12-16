package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int A = sc.nextInt();
		
		for (int i=0; i < A; i++) {
			Integer value = sc.nextInt();
			a.add(value);
		}
		
		System.out.print("How many students for course B? ");
		A = sc.nextInt();
		
		for (int i=0; i < A; i++) {
			Integer value = sc.nextInt();
			b.add(value);
		}
		
		System.out.print("How many students for course C? ");
		A = sc.nextInt();
		
		for (int i=0; i < A; i++) {
			Integer value = sc.nextInt();
			c.add(value);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("**************************************");
		
		for (Integer st : total) {
			System.out.println(st);
		}
		
		System.out.println();
		System.out.print("Total students: " + total.size());
		sc.close();
	}

}
