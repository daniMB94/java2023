package Practica4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tablaA[][] = new int[3][3];
		int tablaB[][] = new int[tablaA.length][tablaA[0].length];
		int tablaC[][] = new int[tablaA.length][tablaA[0].length];
		int numeroIntroducido;
		
		System.out.println("Introduce los elementos de la matriz A:");
		for(int i = 0; i < tablaA.length; i++) {
			for(int j = 0; j < tablaA[0].length; j++) {
				numeroIntroducido = Integer.parseInt(sc.nextLine());
				tablaA[i][j] = numeroIntroducido;
			}
		}
		System.out.println("Introduce los elementos de la matriz B:");
		for(int i = 0; i < tablaB.length; i++) {
			for(int j = 0; j < tablaB[0].length; j++) {
				numeroIntroducido = Integer.parseInt(sc.nextLine());
				tablaB[i][j] = numeroIntroducido;
			}
		}
		
		
		for(int i = 0; i < tablaC.length; i++) {
			for(int j = 0; j < tablaC[0].length; j++) {
				tablaC[i][j] = tablaA[i][j] + tablaB[i][j];
			}
		}
		System.out.println("Tabla A:");
		for(int i = 0; i < tablaA.length; i++) {
			for(int j = 0; j < tablaA[0].length; j++) {
				System.out.print(tablaA[i][j] + ", ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Tabla B:");
		for(int i = 0; i < tablaB.length; i++) {
			for(int j = 0; j < tablaB[0].length; j++) {
				System.out.print(tablaB[i][j] + ", ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Tabla C (suma de tabla A y B):");
		for(int i = 0; i < tablaC.length; i++) {
			for(int j = 0; j < tablaC[0].length; j++) {
				System.out.print(tablaC[i][j] + ", ");
			}
			System.out.println("");
		}
		
		
	}

}
