package Tema3;

import java.util.Scanner;

public class Prueba2 {
	
	public static void pintarVector(int vector[]) {
		System.out.print("[");
		for(int i = 0; i < vector.length; i++) {
			if(i == vector.length-1)
				System.out.print(vector[i] + "");
			else
				System.out.print(vector[i] + ", ");
		}
		
		System.out.println("]");
	}

	public static void main(String[] args) {

		//Crea un array de 6 elementos
		//Pide por teclado 6 enteros y guardalos en las posiciones del array
		//Pinta el array
		//Dime el número mayor y en que posición está
		//Dime la suma de los 6 números
		int mayor = 0, suma = 0, posicionMayor = 0;
		int numeros[] = new int[6];
		
		Scanner sc = new Scanner(System.in);
		try {
			for(int i = 0; i < numeros.length; i++) {
				System.out.print("Escribe un número: ");
				numeros[i] = Integer.parseInt(sc.nextLine());
			}
		} catch(Exception e) {
			System.out.println("Error leyendo de teclado");
		}

		
		for(int i = 0; i < numeros.length; i++) {
			suma = numeros[i] + suma;
			if(numeros[i] > mayor) {
				mayor = numeros[i];
				posicionMayor = i;
			}
		
		}
		
		pintarVector(numeros);
		System.out.println("La suma es: " + suma);
		System.out.println("El número mayor es " + mayor + " y está en la posición " + posicionMayor);

}
}
