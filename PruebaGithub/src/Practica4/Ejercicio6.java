package Practica4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void orden(int numeros[]) {

		int comprobador = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (i == numeros.length-1) {
				if (numeros[i - 1] < numeros[i]) {
					comprobador = comprobador + 1;
				} else if (numeros[i - 1] == numeros[i]) {

				} else
					comprobador = comprobador - 1;

			} else if (numeros[i] < numeros[i + 1]) {

				comprobador = comprobador + 1;
			} else if (numeros[i] == numeros[i + 1]) {

			} else
				comprobador = comprobador - 1;

		}
		if (comprobador == numeros.length) {
			System.out.println("El array está ordenado de menor a mayor");

		} else if (comprobador == -1 * numeros.length) {
			System.out.println("El array está ordenado de mayor a menor");
		} else
			System.out.println("El array está desordenado");

	}

	public static void main(String[] args) {
		int numeros[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido;
		
		System.out.println("Escribe 5 números: ");
		for(int i = 0;i < numeros.length; i++) {
			numeroIntroducido = Integer.parseInt(sc.nextLine());	
			numeros[i] = numeroIntroducido;
		}
		
		orden(numeros);
		
		
	}

}
