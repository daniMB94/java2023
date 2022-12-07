package Practica4;

import java.util.Scanner;

public class Ejercicio3 {

	public static int mayorN(int numeros[]) {
		int mayor;
		mayor = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}

		return mayor;
	}

	public static int menorN(int numeros[]) {
		int menor;
		menor = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

		return menor;
	}

	public static double mediaN(int numeros[]) {
		double media = 0;
		int total = 0;

		for (int i = 0; i < numeros.length; i++) {
			total = total + numeros[i];
		}
		media = total / numeros.length;

		return media;
	}

	public static void main(String[] args) {

		int numeros[] = new int[10];
		int numeroIntroducido;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 10 números: ");

		for (int i = 0; i < 10; i++) {

			numeroIntroducido = Integer.parseInt(sc.nextLine());
			numeros[i] = numeroIntroducido;

		}

		System.out.println("La media de los elementos de la matriz es " + mediaN(numeros));
		System.out.println("El mayor elemento de la matriz es " + mayorN(numeros));
		System.out.println("El menor elemento de la matriz es " + menorN(numeros));

	}

}
