package Practica3;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el número de niveles de la escalera: ");
		num = Integer.parseInt(sc.nextLine());
		
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	
		
		
	}

}
