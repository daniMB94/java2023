package Practica4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int tabla[] = new int[10];
		int tablaB[];
		int numeroIntroducido, posicion;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 números:");
		for(int i = 0; i < tabla.length; i++) {
			numeroIntroducido = Integer.parseInt(sc.nextLine());
			tabla[i] = numeroIntroducido;
		}
		System.out.println("");
		System.out.println("Tabla inicial:");
		for(int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + ", ");
		}
		System.out.println("");
		
		do {
			System.out.print("Introduce la posición que quieras eliminar:");
			posicion = Integer.parseInt(sc.nextLine());
			
		} while (posicion > 9);
		
		tablaB = new int[9];
		
		for(int i = 0; i < tablaB.length; i++) {
			if(i >= posicion) {
				tablaB[i] = tabla[i+1];
			} else {
				tablaB[i] = tabla[i];
			}
			
		}
		System.out.println("La nueva tabla sin la posición indicada es: ");
		for(int i = 0; i < tablaB.length; i++) {
			System.out.print(tablaB[i] + ", ");
		}
		
	}

}
