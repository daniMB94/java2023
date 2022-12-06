package Practica3;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		

		
		int divisor, numero=0, mayorDivisor = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		numero = Integer.parseInt(sc.nextLine());

		for(int i = 1; i <= numero-1; i++) {
			if(numero%i == 0)
				mayorDivisor = i;
			
		}
		System.out.println("El mayor divisor de " + numero + " es: " + mayorDivisor);
		
	}

}
