package Practica3;

import java.util.Scanner;

public class Ejercicio9 {
	
	public static double factorial(int numero) {
		double acumulador = 1;
		
		for(int i = (int) numero; i >= 1; i--) { //hay que pasar la variable número a entero porque el factorial no calcula con decimales
			acumulador = acumulador * i;
		}
		
		return acumulador;
	}

	public static void main(String[] args) {

		//Pedrir número por teclado que quieres obtener el factorial
		double numero = 0;
		double acumulador = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número para calcular su factorial");
		numero = Double.parseDouble(sc.nextLine());
		
		//3 -> 3*2*1
		//8 -> 8*7*6*5*4*3*2*1
		
		
	
		System.out.println("El factorial de " + numero + " es " + factorial((int) numero));
		
	}

}
