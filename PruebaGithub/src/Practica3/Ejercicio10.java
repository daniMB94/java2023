package Practica3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int numero, resultado = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		
		numero = Integer.parseInt(sc.nextLine());
		
		System.out.println("La tabla de multiplicar del " + numero + " es:");
		for(int i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(resultado);
		}
		
	}

}
