package Practica4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerosA[] = new int[5];
		int numerosB[] = new int[numerosA.length];
		int numeroIntroducido, posicion, posicion1, acumulador = 0, acumulador1 = 0;

		System.out.println("Introduce 5 numeros en la matriz:");

		for (int i = 0; i < numerosA.length; i++) {
			numeroIntroducido = Integer.parseInt(sc.nextLine());
			numerosA[i] = numeroIntroducido;
		}
		System.out.println("");
		for (int i = 0; i < numerosA.length; i++) {
			System.out.print(numerosA[i] + ", ");
		}
		System.out.println("");

		do {
			System.out.print("Ahora introduce las posiciones que quieres desplazar la matriz: ");
			posicion = Integer.parseInt(sc.nextLine());
			if (posicion > 5)
				System.out.println("Valor incorrecto, la posicion debe ser menor o igual a 5");
		} while (posicion > 5);

		posicion1 = posicion;
		while (posicion < numerosA.length) {
			numerosB[posicion] = numerosA[acumulador];
			acumulador++;
			posicion++;
		}

		while (acumulador1 < posicion1) {
			numerosB[acumulador1] = numerosA[acumulador];
			acumulador1++;
			acumulador++;
		}

		System.out.println("La matriz con los valores intercambiados " + posicion1 + " posiciones es:");
		for (int i = 0; i < numerosA.length; i++) {
			System.out.print(numerosB[i] + ", ");
		}

	}

}
