package Practica4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[5];
		int numeroIntroducido, primeroUltimo;
		
		System.out.println("Introduce 5 numeros en la matriz:");
		
		for(int i = 0; i < numeros.length; i++) {
			numeroIntroducido = Integer.parseInt(sc.nextLine());
			numeros[i] = numeroIntroducido;
		}
		System.out.println("");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		
		primeroUltimo = numeros[numeros.length-1];
		for(int i = numeros.length-1; i >= 0; i--) {
			if(i == 4) {
				
			} else numeros[i+1] = numeros[i];
		}
		numeros[0] = primeroUltimo;
		
		System.out.println("Pintamos la matriz con los elementos intercambiados en una posición hacia la derecha");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
	}

}
