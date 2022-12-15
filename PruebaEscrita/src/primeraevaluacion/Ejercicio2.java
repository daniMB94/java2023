package primeraevaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void vectorProcentajes(int nTiradas) {
		int dado;
		int aparicion[] = new int[6];
		double porcentaje[] = new double[aparicion.length];
		for (int i = 1; i <= nTiradas; i++) {
			dado = (int) (Math.random() * (6 + 1) - 1) + 1;
			switch (dado) {
			case 1: {
				aparicion[0] = aparicion[0] + 1;
				break;
			}
			case 2: {
				aparicion[1] = aparicion[1] + 1;
				break;
			}
			case 3: {
				aparicion[2] = aparicion[2] + 1;
				break;
			}
			case 4: {
				aparicion[3] = aparicion[3] + 1;
				break;
			}
			case 5: {
				aparicion[4] = aparicion[4] + 1;
				break;
			}
			case 6: {
				aparicion[5] = aparicion[5] + 1;
				break;
			}
			default:
				System.out.println("Existe algún fallo en la generacion de tiradas del dado");
				break;
			}
		}
		for (int i = 0; i < porcentaje.length; i++) {
			porcentaje[i] = (aparicion[i] / nTiradas) * 100;
			System.out.println("El porcentaje de aparicion del " + (i+1) + " es del " + porcentaje[i] + "%");
		}

	}

	public static void main(String[] args) {

		int nTiradas;
		int tirada1;
		int tirada2;
		int suma = 0;
		int contador = 0;

		Scanner sc = new Scanner(System.in);

		do {
			tirada1 = (int) (Math.random() * (6 + 1) - 1) + 1;
			tirada2 = (int) (Math.random() * (6 + 1) - 1) + 1;
			contador = contador + 2;
			suma = suma + tirada1 + tirada2;
			System.out.println("La tirada del primer dado es: " + tirada1);
			System.out.println("La tirdada del segundo dado es: " + tirada2);
		} while (tirada1 != 6 || tirada2 != 6);

		System.out.println("---------------------------------------------------------------------");
		System.out.println("En esta última ronda se ha sacado un 6 en cada dado");
		System.out.println("Se han necesitado " + contador + " tiradas para cumplir la condición");
		System.out.println("La suma hasta el momento de ambos dados es: " + suma);

		System.out.println("---------------------------------------------------------------------");
		System.out.println("Ahora indica el número de veces que quieres tirar un dado");
		nTiradas = Integer.parseInt(sc.nextLine());
		vectorProcentajes(nTiradas);

	}

}
