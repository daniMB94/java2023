package Practica4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int tablaA[] = new int[5];
		int tablaB[] = new int[5];
		int tablaC[] = new int[5];
		int numeroIntroducido;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 números para la matriz A:");
		for(int i = 0; i < tablaA.length; i++) {
			numeroIntroducido = Integer.parseInt(sc.nextLine());
			tablaA[i] = numeroIntroducido;
		}
		
		System.out.println("Pintamos la matriz A");
		for(int i = 0; i < tablaA.length; i++) {
			if(i == 0) {
				System.out.print(tablaA[i]);
			} else  {
				System.out.print(", " + tablaA[i]);
			}
			
		}
		System.out.println("");
		System.out.println("Introduce 10 números para la matriz B:");
		for(int i = 0; i < tablaB.length; i++) {
			numeroIntroducido = Integer.parseInt(sc.nextLine());
			tablaB[i] = numeroIntroducido;
		}
		
		System.out.println("Pintamos la matriz B");
		
		for(int i = 0; i < tablaB.length; i++) {
			if(i == 0) {
				System.out.print(tablaB[i]);
			} else {
				System.out.print(", " + tablaB[i]);
			}
			
		}
		System.out.println("");
		for(int i = 0; i < tablaC.length; i++) {
			tablaC[i] = tablaB[i];
			tablaB[i] = tablaA[i];
			tablaA[i] = tablaC[i];
		}
		
		System.out.println("Las matrices con los valores intercambiados serían:");
		System.out.println("Matriz A");
		for(int i = 0; i < tablaA.length; i++) {
			if(i == 0) {
				System.out.print(tablaA[i]);
			} else {
				System.out.print(", " + tablaA[i]);
			}
			
		}
		System.out.println("");
		System.out.println("Matriz B");
		for(int i = 0; i < tablaB.length; i++) {
			if(i == 0) {
				System.out.print(tablaB[i]);
			} else {
				System.out.print(", " + tablaB[i]);
			}
			
		}
		
		
		
	}

}
