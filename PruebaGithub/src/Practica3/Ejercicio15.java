package Practica3;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		//Pedir n por teclado (entre 1 y 10)
		//n = 3
		//  *	2 espacios y 1*		espacios = 3 - nEstrellas
		// **	1 espacio y 2*		espacios = 3 - nEstrellas
		//***	0 espacios y 3*		espacios = 3 - nEstrellas
		

		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número para crear la figura: ");
		try {
			numero = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Error. No me has escrito un número");
		}
		
		
		for(int i = 1; i <= numero; i++) {
			
			for(int j=1; j <= (numero - i); j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			for(int j=1; j <= i - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
		
		
	}

}
