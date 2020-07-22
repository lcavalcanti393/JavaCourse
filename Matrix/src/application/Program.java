package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt(); //line
		int n = sc.nextInt(); //column
		
		int[][] mat = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position: " + i + ", " + j);
					if(j>0) 
						System.out.println("Left: "+ mat[i][j-1]);
					if(j<3)
						System.out.println("Right: "+ mat[i][j+1]);
					if(i>0)
						System.out.println("Up: "+ mat[i-1][j]);
					if(i<2)
						System.out.println("Down: "+ mat[i+1][j]);
					System.out.println("---------------");
				}
			}
		}
		
		
		sc.close();
	}

}
