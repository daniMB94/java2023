package Practica4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numerosA[] = new int[10];
		int numerosB[] = new int[numerosA.length];
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido;
		System.out.println("Introduce 10 números:");
		
		for(int i = 0; i < numerosA.length; i++) {
			numeroIntroducido = Integer.parseInt(sc.nextLine());
			numerosA[i] = numeroIntroducido;
		}
		
		System.out.println("MATRIZ ORIGINAL");
		for(int i = 0; i < numerosA.length; i++) {
			System.out.print(numerosA[i] + ", ");
		}
		
		for(int i = 0; i < numerosA.length; i++) {
			numerosB[i] = numerosA[numerosA.length-1-i];
		}
		System.out.println("");
		System.out.println("MATRIZ TRANSFORMADA");
		for(int i = 0; i < numerosA.length; i++) {
			System.out.print(numerosB[i] + ", ");
		}
	}

}
