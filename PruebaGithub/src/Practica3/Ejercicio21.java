package Practica3;

import java.util.Scanner;

public class Ejercicio21 {
	
	public static boolean primo(int numero) {
		boolean esPrimo = false;
		
		for(int i = 2; i < numero -1 ; i++) {
			if(numero%i == 0) {
				esPrimo = false;
				break;
			} else {
				esPrimo = true;
			}
	
		}
		
		return esPrimo;
	}

	public static void main(String[] args) {

		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		numero = Integer.parseInt(sc.nextLine());
		
		if(primo(numero) == false) {
			System.out.println("El número " + numero + " no es primo");
		} else {
			System.out.println("El número " + numero + " si es primo");
		}
			
		
		


}
	
}
