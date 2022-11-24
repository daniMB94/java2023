package Practica2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {


		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el valor de a: ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("Escribe el valor de b: ");
		b = Integer.parseInt(sc.nextLine());


		
		c = a;
		a = b;
		b = c;
		
		System.out.println("El valor de 'a' ahora es 'b': " + a);
		System.out.println("El valor de 'b' ahora es 'a': " + b);
		
		
		
	}

}
