package Practica3;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

 		int total = 0, numero = 0;
 		int nElementos = 0;
 		double media;
 		
 		
 		Scanner sc = new Scanner(System.in);
 		
 		while (numero != -1) {
		
 		System.out.print("Introduce un número: ");
		numero = Integer.parseInt(sc.nextLine());
		if(numero != -1 ) {
			nElementos += 1;
			total = numero + total;
		}


		}

		media = total / nElementos;
		System.out.println("La media es: " + media);

		
 
	}

}
