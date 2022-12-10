package Practica4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[5];
		int numeroIntroducido;
		
		System.out.println("Introduce 5 numeros en la matriz:");
		
		for(int i = 0; i < numeros.length; i++) {
			numeroIntroducido = Integer.parseInt(sc.nextLine());
			numeros[i] = numeroIntroducido;
		}
		System.out.println("");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		
		
		
		
	}

}
