package Practica4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		int fila = 0, numeroIntroducido;
		int matrizSuma[][] = new int[3][4];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce todos los elementos de la matriz 3x4:");
		
		for(int i = 0; i < matrizSuma.length; i++) {
			for(int j = 0; j < matrizSuma[0].length; j++) {
				numeroIntroducido = Integer.parseInt(sc.nextLine());
				matrizSuma[i][j] = numeroIntroducido;
			}
		}
		
		for(int i = 0; i < matrizSuma.length; i++) {
			for(int j = 0; j < matrizSuma[0].length; j++ ) {
				System.out.print(matrizSuma[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for(int i = 0; i < matrizSuma.length; i++) {
			System.out.print("La suma de la fila " + i + " es ");
			for(int j = 0; j < matrizSuma[0].length; j++) {
				fila = fila + matrizSuma[i][j];
			}
			System.out.println(fila);
			fila = 0;
		}
		
		
		
	}

}
