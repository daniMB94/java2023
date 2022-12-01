package Practica3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		int contador = 1, numero, aux;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número de varias cifras: ");
		
		numero = Integer.parseInt(sc.nextLine());
		aux = numero;
		
		while(aux / 10 > 0) {
			aux = aux / 10;
			contador = contador + 1;
		}
		
		System.out.println("El número de cifras de " + numero + " es: " + contador);
		
		
	}

}
