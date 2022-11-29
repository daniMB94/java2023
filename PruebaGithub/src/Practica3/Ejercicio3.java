package Practica3;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static int leerTeclado() {
		int a;
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.nextLine());
		return a;
	}
	
	
	
	public static int digito(int a) {
		int digitoN = 0;
		int b;
		b = a;
	
		while(b >= 10 || b < 0) {
			System.out.println("Ese número tiene más de 2 dígitos");
			System.out.print("Introduce un número de un dígito: ");
			b = leerTeclado();
		}

			switch (b) {
			
			case 0: {
				System.out.println("Cero");
				break;
			}
			case 1: {
				System.out.println("Uno");
				break;
			}
			case 2: {
				System.out.println("Dos");
				break;
			}
			case 3: {
				System.out.println("Tres");
				break;
			}
			case 4: {
				System.out.println("Cuatro");
				break;
			}
			case 5: {
				System.out.println("Cinco");
				break;
			}
			case 6: {
				System.out.println("Seis");
				break;
			}
			case 7: {
				System.out.println("Siete");
				break;
			}
			case 8: {
				System.out.println("Ocho");
				break;
			}
			case 9: {
				System.out.println("Nueve");
				break;
			}
			}
		
		return digitoN;
	}

	public static void main(String[] args) {

		System.out.print("Introduce un número de un dígito: ");
		digito(leerTeclado());
		
	}

}
