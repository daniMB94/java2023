package Practica3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Introduce un número entre 1 y 10: ");
		
		Scanner sc = new Scanner(System.in);
		
		numero = Integer.parseInt(sc.nextLine());
		
		while(numero < 1 || numero > 10) {
			System.out.println("Número incorrecto.");
			System.out.println("Introduce un número entre 1 y 10: ");
			numero = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Numero correcto");
		
	}

}
