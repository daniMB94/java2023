package Practica2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {


		double radio, area, perimetro;
		System.out.println("Escribe el radio: ");
		Scanner sc = new Scanner(System.in);
		
		radio = Double.parseDouble(sc.nextLine());
		
		area = Math.PI * radio * radio;
		
		perimetro = 2 * Math.PI * radio;
		
		System.out.println("El área del círculo es: " + area);
		System.out.println("El perímetro del círculo es: " + perimetro);
		
	}

}
