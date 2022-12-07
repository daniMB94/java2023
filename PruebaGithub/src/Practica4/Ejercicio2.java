package Practica4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numeros[] = new int[10];
		int numeroIntroducido, mayor, menor, total = 0;
		double media;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 10 números: ");

		for (int i = 0; i < 10; i++) {

			numeroIntroducido = Integer.parseInt(sc.nextLine());
			numeros[i] = numeroIntroducido;

		}

		for (int i = 0; i < numeros.length; i++) {
			if (i == 0) {
				System.out.print(numeros[i]);
			}
			System.out.print(", " + numeros[i]);
		}
		System.out.println("");

		for (int i = 0; i < numeros.length; i++) {
			total = total + numeros[i];
		}
		media = total / numeros.length;
		System.out.println("La media es: " + media);

		menor = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}

		}

		mayor = numeros[0];

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}

		}

		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
	}
}
