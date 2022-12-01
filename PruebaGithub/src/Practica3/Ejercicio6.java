package Practica3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.print("Introduce un número positivo: ");
			numero = Integer.parseInt(sc.nextLine()); 
		} while(numero < 0);
		if (numero < 4) {
			System.out.println("No hay multiplos de 2 que mostrar");
		} else {
			System.out.println("Los múltiplos de 2 hasta el número " + numero + " son: ");
			for(int i = 0; i < numero; i++) {
				if(i%2 == 0) {
					System.out.print(i + ", ");
				}
			}
		
		}
	}

}
