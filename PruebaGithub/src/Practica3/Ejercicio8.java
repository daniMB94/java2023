package Practica3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int numero, numeroDoble, numeroTriple;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.print("Introduce un número positivo: ");
			numero = Integer.parseInt(sc.nextLine()); 
		} while(numero < 0);
		System.out.println("La tabla de dobles desde 1 hasta " + numero + " es:");
		for(int i = 1; i <= numero; i++) {
			numeroDoble = i * 2;
			if(numeroDoble <= numero)
			System.out.println(numeroDoble);
		}
		System.out.println("La tabla de triples desde 1 hasta " + numero + " es:");
		for(int i = 1; i <= numero; i++) {
			numeroTriple = i * 3;
			if(numeroTriple <= numero)
			System.out.println(numeroTriple);
		}
		
		
	}

}
