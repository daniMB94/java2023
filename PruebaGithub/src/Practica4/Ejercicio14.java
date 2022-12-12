package Practica4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		int tabla[][] = new int[5][3];
		Scanner sc = new Scanner(System.in);
		double media;
		int mayor, menor, numeroIntroducido, suma=0;
		
		System.out.println("Introduce los elementos de la matriz 5x3");
		
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[0].length; j++) {
				numeroIntroducido = Integer.parseInt(sc.nextLine());
				tabla[i][j] = numeroIntroducido;
			}
		}
		
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[0].length; j++) {
				System.out.print(tabla[i][j] + ", ");
			}
			System.out.println("");
		}
		
		menor = tabla[0][0];
		mayor = tabla[0][0];
		for(int i = 0; i < tabla.length; i++) {
			for(int j = 0; j < tabla[0].length; j++) {
				if(tabla[i][j] > mayor) mayor = tabla[i][j];
				if(tabla[i][j] < menor)	menor = tabla[i][j];
				suma = suma + tabla[i][j];
			}
		}
		System.out.println("");
		
		System.out.println("La media es: " + suma/(tabla[0].length * tabla.length));
		System.out.println("El elemento mayor es: " + mayor);
		System.out.println("El elemento menor es: " + menor);
		
		
	}

}
