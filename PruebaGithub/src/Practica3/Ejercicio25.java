package Practica3;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		
		int numero = 0, numeroReves = 0, unidades, decenas, centenas;
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 999: ");
		numero = Integer.parseInt(sc.nextLine());
		
		unidades = (numero / 100);
		decenas = (numero % 100) / 10;
		centenas = (numero % 100) % 10;
		
		numeroReves =  centenas*100 + decenas*10 + unidades;
		
		if(numero == numeroReves) {
			System.out.println("Es capicúa");
		} else {
			System.out.println("No es capicúa");
		}
		
		
		
		
	}

}
