package Practica3;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static int multiplo(int c) {
		int multiploN=0;
		if(c%2 == 0) {
			multiploN = 2;
		} else if(c%3 == 0) {
			multiploN = 3;
		} else if (c%5 == 0) {
			multiploN = 5;
		} else if(c%7 == 0) {
			multiploN = 7;
		}
		
		return multiploN;
	}

	public static void main(String[] args) {
		
		int a, b;
		
		System.out.print("Elige un número: ");
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.nextLine());
		
		b = multiplo(a);
		
		if(multiplo(a) != 2 || multiplo(a) != 3 || multiplo(a) != 5 || multiplo(a) != 7) {
			System.out.println("El número " + a + " no es múltiplo ni de 2 ni de 3 ni de 5 ni de 7");
		} else {
			System.out.println(a + " es múltiplo de " + multiplo(a));
		}
		
		
	}

}
