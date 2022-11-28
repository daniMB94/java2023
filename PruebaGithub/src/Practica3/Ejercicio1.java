package Practica3;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static int mayorN(int a, int b, int c) {
		int mayorNumero;
		
		if(a > b || c > b) {
			if(a > b) {
				mayorNumero = a;
			} else {
				mayorNumero = c;
			}
		} else {
			mayorNumero = b;
		}
		
		return mayorNumero;
	}

	public static void main(String[] args) {
		
		int mayorEs, a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el valor de a: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el valor de b: ");
		b = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el valor de c: ");
		c = Integer.parseInt(sc.nextLine());
		
		mayorEs = mayorN(a,b,c);
		
		System.out.println("El numero mayor es "+ mayorEs);
	}

}
