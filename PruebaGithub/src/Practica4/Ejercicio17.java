package Practica4;

import java.util.Arrays;

public class Ejercicio17 {

	public static void pintarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
				;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Se puede copiar un algoritomo de ordenación de los hechos en clase ó
		// Arrays.sort(array[])

		int[][] matriz = new int[5][5];
		int[] matrizA = new int[matriz.length * matriz[0].length];
		int contador = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100 + 1);
			}
		}

		pintarMatriz(matriz);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matrizA[contador] = matriz[i][j];

				contador += 1;
			}
		}

		Arrays.sort(matrizA);
		contador = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = matrizA[contador];

				contador += 1;
			}
		}
		System.out.println("--------------------------");
		pintarMatriz(matriz);
	}

}
