package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int  n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String nameProduct = sc.next();
			
		}
		
		System.out.println();
		
		sc.close();
	}

}
