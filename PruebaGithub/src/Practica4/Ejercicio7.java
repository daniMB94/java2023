package Practica4;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void introduccion(int numeros[], int posicion, int numeroIntroducido) {
		

		
		for(int i = numeros.length-1; i > posicion; i--) {
			numeros[i] = numeros[i-1];
		}
		numeros[posicion] = numeroIntroducido;
		
		System.out.println("El resultado de introducir el número indicado en el hueco indicado es:");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		
		System.out.println("");
		System.out.println("Aún seguiría quedando otro hueco libre");
	}

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		int numeroIntroducido, posicion;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 8 numeros en la tabla de 10 elementos:");
		
		for(int i = 0; i < numeros.length-2; i++ ) {
			numeroIntroducido = Integer.parseInt(sc.nextLine());
			numeros[i] = numeroIntroducido;
		}
		
		System.out.println("Pintamos la matriz inicial (tiene 2 huecos libres)");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		System.out.println("");
		System.out.println("Introduce una posicion y un número para insertarlo en uno de los huecos disponibles:");
		System.out.print("Posicion: ");
		posicion = Integer.parseInt(sc.nextLine());
		System.out.print("Numero: ");
		numeroIntroducido = Integer.parseInt(sc.nextLine());

		introduccion(numeros, posicion, numeroIntroducido);
		
	}

}
