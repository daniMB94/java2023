package Practica3;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {


		
		int numero, unidades, decenas, centenas;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 999: ");
		numero = Integer.parseInt(sc.nextLine());
		
		unidades = (numero / 100);
		decenas = (numero % 100) / 10;
		centenas = (numero % 100) % 10;
		
		System.out.println("El número del revés es: " + centenas + decenas + unidades);
		
		
		
		
	}

}
