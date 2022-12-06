package Practica3;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {


		
		int divisor, numero=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		numero = Integer.parseInt(sc.nextLine());
		System.out.println("Los divisores de " + numero + " son: ");
		for(int i = 1; i <= numero; i++) {
			if(numero%i == 0)
				System.out.print(i + (", "));
			
		}
		
	}

}
